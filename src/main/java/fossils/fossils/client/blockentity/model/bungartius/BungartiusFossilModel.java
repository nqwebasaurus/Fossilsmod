package fossils.fossils.client.blockentity.model.bungartius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BungartiusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Headslope;
	private final ModelPart Throat;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperjawslope2;
	private final ModelPart Upperjawslope1;
	private final ModelPart Rightcheekslope;
	private final ModelPart Lowerjawback;

	public BungartiusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Head = this.root.getChild("Head");
		this.Headslope = this.Head.getChild("Headslope");
		this.Throat = this.Head.getChild("Throat");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperjawslope2 = this.Upperjawfront.getChild("Upperjawslope2");
		this.Upperjawslope1 = this.Upperjawback.getChild("Upperjawslope1");
		this.Rightcheekslope = this.Upperjawback.getChild("Rightcheekslope");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.6F, 9.0F));

		PartDefinition Head = root.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5992F, -10.6707F, -0.0236F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(-0.1F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 6).mirror().addBox(-0.1F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(47, 3).mirror().addBox(-0.75F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8455F, 3.2561F, 1.6294F, 1.9584F, -1.5294F, 3.0082F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4335F, 1.628F, 1.9219F, 3.1007F, 0.3601F, 1.8109F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(47, 9).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.654F, 2.381F, 2.542F, 3.0928F, -0.6688F, 1.8556F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(5, 47).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0063F, 3.8148F, 2.0201F, 0.156F, -1.3217F, -1.4675F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(35, 7).mirror().addBox(-1.15F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8455F, 3.2561F, 1.6294F, 0.0642F, -0.931F, -1.3678F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(35, 4).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3644F, 3.5336F, -0.1465F, 0.041F, -0.3644F, -1.3309F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(46, 41).mirror().addBox(-0.625F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 24).mirror().addBox(-0.55F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.596F, 1.9536F, -2.3151F, 0.0645F, 0.23F, -1.2971F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-1.6777F, -0.2585F, -1.8076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(45, 29).mirror().addBox(-1.5277F, -0.1085F, -1.1576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.7268F, -1.1278F, 0.0703F, -0.4667F, -1.3434F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-0.8464F, -0.528F, -0.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2334F, 1.4698F, 0.2102F, -0.0618F, 1.1012F, -1.1591F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(30, 46).mirror().addBox(-0.1427F, -0.5174F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2334F, 1.4698F, 0.2102F, 0.1166F, 0.7041F, -0.969F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(45, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1306F, -0.5189F, 0.1362F, 0.0948F, -0.6044F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-1.0038F, 0.0078F, -1.0484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.6518F, -1.1278F, 0.0388F, 0.1588F, -1.3101F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(21, 34).mirror().addBox(-0.5998F, 0.0077F, 1.0294F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.7268F, -1.1278F, 0.055F, -0.8003F, -1.3558F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(25, 46).mirror().addBox(-1.1352F, 0.0077F, 0.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.7268F, -1.1278F, 0.0417F, -0.408F, -1.3328F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-1.2726F, 0.0077F, -0.698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.7268F, -1.1278F, 0.0387F, -0.1464F, -1.3219F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-0.9F, -0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(28, 29).mirror().addBox(-0.9F, -0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3192F, 1.2098F, -3.2335F, 0.1137F, 0.1763F, -0.9935F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(7, 30).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.329F, 0.8306F, -1.3142F, 0.0884F, 0.1404F, -1.0061F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(28, 33).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2791F, -1.4065F, 0.1379F, 0.0924F, -0.587F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-1.15F, -0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3192F, 1.2098F, -3.2335F, 0.112F, -0.0405F, -1.0181F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(28, 25).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6487F, -3.3528F, 0.1724F, 0.1195F, -0.6005F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(46, 38).addBox(-0.1536F, -0.528F, -0.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2334F, 1.4698F, 0.2102F, -0.0618F, -1.1012F, 1.1591F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(30, 46).addBox(-0.8573F, -0.5174F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2334F, 1.4698F, 0.2102F, 0.1166F, -0.7041F, 0.969F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(45, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.1306F, -0.5189F, 0.1362F, -0.0948F, 0.6044F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(32, 43).addBox(-4.5F, 0.0103F, -0.5325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(28, 8).addBox(-4.5F, 0.0103F, -1.9325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.1151F, -0.4885F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(47, 12).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4335F, 1.628F, 1.9219F, 3.1007F, -0.3601F, -1.8109F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(47, 9).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.654F, 2.381F, 2.542F, 3.0928F, 0.6688F, -1.8556F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(47, 6).addBox(-0.9F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(15, 47).addBox(-0.9F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 3).addBox(-0.25F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8455F, 3.2561F, 1.6294F, 1.9584F, 1.5294F, -3.0082F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(5, 47).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0063F, 3.8148F, 2.0201F, 0.156F, 1.3217F, 1.4675F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(35, 7).addBox(-0.85F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8455F, 3.2561F, 1.6294F, 0.0642F, 0.931F, 1.3678F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(35, 4).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3644F, 3.5336F, -0.1465F, 0.041F, 0.3644F, 1.3309F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(21, 34).addBox(-1.4002F, 0.0077F, 1.0294F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8635F, 1.7268F, -1.1278F, 0.055F, 0.8003F, 1.3558F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(25, 46).addBox(0.1352F, 0.0077F, 0.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8635F, 1.7268F, -1.1278F, 0.0417F, 0.408F, 1.3328F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(45, 35).addBox(0.2726F, 0.0077F, -0.698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8635F, 1.7268F, -1.1278F, 0.0387F, 0.1464F, 1.3219F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(17, 0).addBox(0.0038F, 0.0078F, -1.0484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8635F, 1.6518F, -1.1278F, 0.0388F, -0.1588F, 1.3101F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(7, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.329F, 0.8306F, -1.3142F, 0.0884F, -0.1404F, 1.0061F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(28, 33).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2791F, -1.4065F, 0.1379F, -0.0924F, 0.587F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(46, 41).addBox(-0.375F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 24).addBox(-0.45F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.596F, 1.9536F, -2.3151F, 0.0645F, -0.23F, 1.2971F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(55, 21).addBox(0.6777F, -0.2585F, -1.8076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(45, 29).addBox(0.5277F, -0.1085F, -1.1576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.8635F, 1.7268F, -1.1278F, 0.0703F, 0.4667F, 1.3434F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(0, 30).addBox(0.15F, -0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3192F, 1.2098F, -3.2335F, 0.112F, 0.0405F, 1.0181F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(45, 32).addBox(-0.1F, -0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(28, 29).addBox(-0.1F, -0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3192F, 1.2098F, -3.2335F, 0.1137F, -0.1763F, 0.9935F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(28, 25).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.6487F, -3.3528F, 0.1724F, -0.1195F, 0.6005F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(28, 21).addBox(-3.5F, 0.028F, -1.9918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, 0.4151F, -2.3885F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0849F, 7.7115F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Headslope_r1 = Headslope.addOrReplaceChild("Headslope_r1", CubeListBuilder.create().texOffs(35, 53).mirror().addBox(-0.3F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 53).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1662F, 0.2241F, -0.0514F, 0.7835F, -0.061F));

		PartDefinition Headslope_r2 = Headslope.addOrReplaceChild("Headslope_r2", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(55, 48).mirror().addBox(-0.3F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.651F, -4.3438F, -0.191F, -0.6023F, 0.1091F));

		PartDefinition Headslope_r3 = Headslope.addOrReplaceChild("Headslope_r3", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2517F, -1.1733F, -0.0507F, -0.0341F, -0.5925F));

		PartDefinition Headslope_r4 = Headslope.addOrReplaceChild("Headslope_r4", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9649F, 0.7114F, -0.3106F, -1.65F, -0.0046F, 0.9964F));

		PartDefinition Headslope_r5 = Headslope.addOrReplaceChild("Headslope_r5", CubeListBuilder.create().texOffs(40, 26).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0859F, 0.7951F, -1.2997F, -1.4231F, -0.0046F, 0.9964F));

		PartDefinition Headslope_r6 = Headslope.addOrReplaceChild("Headslope_r6", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(0.1F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5041F, 0.3035F, -2.0314F, -1.8769F, -0.0046F, 0.9964F));

		PartDefinition Headslope_r7 = Headslope.addOrReplaceChild("Headslope_r7", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-1.575F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5417F, 5.4966F, -8.0247F, -0.9548F, 0.5009F, 0.5335F));

		PartDefinition Headslope_r8 = Headslope.addOrReplaceChild("Headslope_r8", CubeListBuilder.create().texOffs(7, 34).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5417F, 5.4966F, -8.0247F, -1.0267F, -0.2048F, 0.0833F));

		PartDefinition Headslope_r9 = Headslope.addOrReplaceChild("Headslope_r9", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.8947F, 4.9472F, -7.5801F, -1.0155F, -0.2792F, 0.0364F));

		PartDefinition Headslope_r10 = Headslope.addOrReplaceChild("Headslope_r10", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-0.2004F, -0.6018F, -0.2434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(42, 20).mirror().addBox(-0.2004F, -0.5018F, -0.2434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.979F, 4.4443F, -6.443F, -1.331F, -0.13F, 0.1289F));

		PartDefinition Headslope_r11 = Headslope.addOrReplaceChild("Headslope_r11", CubeListBuilder.create().texOffs(10, 42).mirror().addBox(-0.2004F, -0.0224F, -0.1874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.979F, 4.4443F, -6.443F, -1.5492F, -0.13F, 0.1289F));

		PartDefinition Headslope_r12 = Headslope.addOrReplaceChild("Headslope_r12", CubeListBuilder.create().texOffs(5, 41).mirror().addBox(-0.2004F, 0.0613F, -0.8262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(40, 35).mirror().addBox(-0.2004F, -0.2388F, -0.8262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.979F, 4.4443F, -6.443F, -0.8074F, -0.13F, 0.1289F));

		PartDefinition Headslope_r13 = Headslope.addOrReplaceChild("Headslope_r13", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(-0.2004F, -0.5173F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.979F, 4.4443F, -6.443F, -1.1565F, -0.13F, 0.1289F));

		PartDefinition Headslope_r14 = Headslope.addOrReplaceChild("Headslope_r14", CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-0.5F, -1.15F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5374F, 4.6565F, -6.6554F, -0.9013F, -0.0127F, 0.23F));

		PartDefinition Headslope_r15 = Headslope.addOrReplaceChild("Headslope_r15", CubeListBuilder.create().texOffs(22, 41).mirror().addBox(-0.5F, 0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3463F, 3.7465F, -4.9669F, -1.0845F, -0.0127F, 0.23F));

		PartDefinition Headslope_r16 = Headslope.addOrReplaceChild("Headslope_r16", CubeListBuilder.create().texOffs(35, 27).mirror().addBox(-0.5F, -1.175F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3463F, 3.7465F, -4.9669F, -1.294F, -0.0127F, 0.23F));

		PartDefinition Headslope_r17 = Headslope.addOrReplaceChild("Headslope_r17", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(-0.5F, -0.575F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 53).mirror().addBox(-0.5F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3093F, 3.6184F, -5.5058F, -0.3777F, -0.0127F, 0.23F));

		PartDefinition Headslope_r18 = Headslope.addOrReplaceChild("Headslope_r18", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(0.0235F, 0.9718F, -0.8278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2755F, 1.1437F, -4.9012F, -0.1159F, -0.0127F, 0.23F));

		PartDefinition Headslope_r19 = Headslope.addOrReplaceChild("Headslope_r19", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(0.0235F, 0.4375F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2755F, 1.1437F, -4.9012F, -0.0286F, -0.0127F, 0.23F));

		PartDefinition Headslope_r20 = Headslope.addOrReplaceChild("Headslope_r20", CubeListBuilder.create().texOffs(17, 41).mirror().addBox(0.0235F, -0.5746F, -1.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2755F, 1.1437F, -4.9012F, 0.6259F, -0.0127F, 0.23F));

		PartDefinition Headslope_r21 = Headslope.addOrReplaceChild("Headslope_r21", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-0.5F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7761F, 1.2863F, -5.1156F, -0.7068F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r22 = Headslope.addOrReplaceChild("Headslope_r22", CubeListBuilder.create().texOffs(24, 17).mirror().addBox(0.0F, 0.45F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 0.449F, -2.8981F, -0.3141F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r23 = Headslope.addOrReplaceChild("Headslope_r23", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(0.0235F, 0.0248F, -1.9327F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2755F, 1.1437F, -4.9012F, 1.1931F, -0.0127F, 0.23F));

		PartDefinition Headslope_r24 = Headslope.addOrReplaceChild("Headslope_r24", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(0.0F, -0.125F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 0.449F, -2.8981F, 0.9076F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r25 = Headslope.addOrReplaceChild("Headslope_r25", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(0.0F, 0.675F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 0.449F, -2.8981F, -0.8813F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r26 = Headslope.addOrReplaceChild("Headslope_r26", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(0.0F, -0.5F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 0.449F, -2.8981F, -0.7941F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r27 = Headslope.addOrReplaceChild("Headslope_r27", CubeListBuilder.create().texOffs(21, 22).mirror().addBox(0.0F, 0.0F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 0.449F, -2.8981F, -0.1396F, 0.0723F, 0.4749F));

		PartDefinition Headslope_r28 = Headslope.addOrReplaceChild("Headslope_r28", CubeListBuilder.create().texOffs(14, 27).mirror().addBox(0.0F, 0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(26, 0).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.432F, -2.961F, -0.0906F, 0.1285F, 0.9541F));

		PartDefinition Headslope_r29 = Headslope.addOrReplaceChild("Headslope_r29", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8939F, 0.3189F, -3.8852F, -0.6578F, 0.1285F, 0.9541F));

		PartDefinition Headslope_r30 = Headslope.addOrReplaceChild("Headslope_r30", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2517F, -1.1733F, -0.0507F, 0.0341F, 0.5925F));

		PartDefinition Headslope_r31 = Headslope.addOrReplaceChild("Headslope_r31", CubeListBuilder.create().texOffs(35, 53).addBox(-0.7F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 53).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.2F, -0.1662F, 0.2241F, -0.0514F, -0.7835F, 0.061F));

		PartDefinition Headslope_r32 = Headslope.addOrReplaceChild("Headslope_r32", CubeListBuilder.create().texOffs(53, 15).addBox(-0.5F, -0.325F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 4).addBox(-0.5F, -0.025F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2756F, -1.9733F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Headslope_r33 = Headslope.addOrReplaceChild("Headslope_r33", CubeListBuilder.create().texOffs(52, 12).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8939F, 0.3189F, -3.8852F, -0.6578F, -0.1285F, -0.9541F));

		PartDefinition Headslope_r34 = Headslope.addOrReplaceChild("Headslope_r34", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -0.5F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7287F, 0.449F, -2.8981F, -0.7941F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r35 = Headslope.addOrReplaceChild("Headslope_r35", CubeListBuilder.create().texOffs(30, 52).addBox(-0.5F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7761F, 1.2863F, -5.1156F, -0.7068F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r36 = Headslope.addOrReplaceChild("Headslope_r36", CubeListBuilder.create().texOffs(42, 6).addBox(-1.0F, 0.675F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7287F, 0.449F, -2.8981F, -0.8813F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r37 = Headslope.addOrReplaceChild("Headslope_r37", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5F, -1.15F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5374F, 4.6565F, -6.6554F, -0.9013F, 0.0127F, -0.23F));

		PartDefinition Headslope_r38 = Headslope.addOrReplaceChild("Headslope_r38", CubeListBuilder.create().texOffs(10, 54).addBox(-0.7996F, -0.6018F, -0.2434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(42, 20).addBox(-0.7996F, -0.5018F, -0.2434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.979F, 4.4443F, -6.443F, -1.331F, 0.13F, -0.1289F));

		PartDefinition Headslope_r39 = Headslope.addOrReplaceChild("Headslope_r39", CubeListBuilder.create().texOffs(10, 42).addBox(-0.7996F, -0.0224F, -0.1874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.979F, 4.4443F, -6.443F, -1.5492F, 0.13F, -0.1289F));

		PartDefinition Headslope_r40 = Headslope.addOrReplaceChild("Headslope_r40", CubeListBuilder.create().texOffs(35, 13).addBox(-0.425F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5417F, 5.4966F, -8.0247F, -0.9548F, -0.5009F, -0.5335F));

		PartDefinition Headslope_r41 = Headslope.addOrReplaceChild("Headslope_r41", CubeListBuilder.create().texOffs(7, 34).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5417F, 5.4966F, -8.0247F, -1.0267F, 0.2048F, -0.0833F));

		PartDefinition Headslope_r42 = Headslope.addOrReplaceChild("Headslope_r42", CubeListBuilder.create().texOffs(35, 23).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.8947F, 4.9472F, -7.5801F, -1.0155F, 0.2792F, -0.0364F));

		PartDefinition Headslope_r43 = Headslope.addOrReplaceChild("Headslope_r43", CubeListBuilder.create().texOffs(35, 31).addBox(-0.7996F, -0.5173F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.979F, 4.4443F, -6.443F, -1.1565F, 0.13F, -0.1289F));

		PartDefinition Headslope_r44 = Headslope.addOrReplaceChild("Headslope_r44", CubeListBuilder.create().texOffs(5, 41).addBox(-0.7996F, 0.0613F, -0.8262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(40, 35).addBox(-0.7996F, -0.2388F, -0.8262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.979F, 4.4443F, -6.443F, -0.8074F, 0.13F, -0.1289F));

		PartDefinition Headslope_r45 = Headslope.addOrReplaceChild("Headslope_r45", CubeListBuilder.create().texOffs(22, 41).addBox(-0.5F, 0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3463F, 3.7465F, -4.9669F, -1.0845F, 0.0127F, -0.23F));

		PartDefinition Headslope_r46 = Headslope.addOrReplaceChild("Headslope_r46", CubeListBuilder.create().texOffs(35, 27).addBox(-0.5F, -1.175F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3463F, 3.7465F, -4.9669F, -1.294F, 0.0127F, -0.23F));

		PartDefinition Headslope_r47 = Headslope.addOrReplaceChild("Headslope_r47", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -0.575F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(15, 53).addBox(-0.5F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3093F, 3.6184F, -5.5058F, -0.3777F, 0.0127F, -0.23F));

		PartDefinition Headslope_r48 = Headslope.addOrReplaceChild("Headslope_r48", CubeListBuilder.create().texOffs(5, 53).addBox(-1.0235F, 0.9718F, -0.8278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2755F, 1.1437F, -4.9012F, -0.1159F, 0.0127F, -0.23F));

		PartDefinition Headslope_r49 = Headslope.addOrReplaceChild("Headslope_r49", CubeListBuilder.create().texOffs(52, 42).addBox(-1.0235F, 0.4375F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2755F, 1.1437F, -4.9012F, -0.0286F, 0.0127F, -0.23F));

		PartDefinition Headslope_r50 = Headslope.addOrReplaceChild("Headslope_r50", CubeListBuilder.create().texOffs(17, 41).addBox(-1.0235F, -0.5746F, -1.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2755F, 1.1437F, -4.9012F, 0.6259F, 0.0127F, -0.23F));

		PartDefinition Headslope_r51 = Headslope.addOrReplaceChild("Headslope_r51", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0235F, 0.0248F, -1.9327F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2755F, 1.1437F, -4.9012F, 1.1931F, 0.0127F, -0.23F));

		PartDefinition Headslope_r52 = Headslope.addOrReplaceChild("Headslope_r52", CubeListBuilder.create().texOffs(25, 52).addBox(-1.0F, -0.125F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7287F, 0.449F, -2.8981F, 0.9076F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r53 = Headslope.addOrReplaceChild("Headslope_r53", CubeListBuilder.create().texOffs(24, 17).addBox(-1.0F, 0.45F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7287F, 0.449F, -2.8981F, -0.3141F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r54 = Headslope.addOrReplaceChild("Headslope_r54", CubeListBuilder.create().texOffs(21, 22).addBox(-1.0F, 0.0F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7287F, 0.449F, -2.8981F, -0.1396F, -0.0723F, -0.4749F));

		PartDefinition Headslope_r55 = Headslope.addOrReplaceChild("Headslope_r55", CubeListBuilder.create().texOffs(14, 27).addBox(-1.0F, 0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(26, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.432F, -2.961F, -0.0906F, -0.1285F, -0.9541F));

		PartDefinition Headslope_r56 = Headslope.addOrReplaceChild("Headslope_r56", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9649F, 0.7114F, -0.3106F, -1.65F, 0.0046F, -0.9964F));

		PartDefinition Headslope_r57 = Headslope.addOrReplaceChild("Headslope_r57", CubeListBuilder.create().texOffs(40, 26).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0859F, 0.7951F, -1.2997F, -1.4231F, 0.0046F, -0.9964F));

		PartDefinition Headslope_r58 = Headslope.addOrReplaceChild("Headslope_r58", CubeListBuilder.create().texOffs(40, 23).addBox(-1.1F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5041F, 0.3035F, -2.0314F, -1.8769F, 0.0046F, -0.9964F));

		PartDefinition Headslope_r59 = Headslope.addOrReplaceChild("Headslope_r59", CubeListBuilder.create().texOffs(55, 48).addBox(-0.7F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(55, 45).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.2F, -0.651F, -4.3438F, -0.191F, 0.6023F, -0.1091F));

		PartDefinition Headslope_r60 = Headslope.addOrReplaceChild("Headslope_r60", CubeListBuilder.create().texOffs(52, 18).addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 12).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2756F, -1.9733F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(19, 5).addBox(-0.5F, -0.821F, 7.7736F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 14).addBox(-1.5F, -0.838F, 2.8613F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offset(0.0F, 7.5151F, 1.7115F));

		PartDefinition Throatslope_r1 = Throat.addOrReplaceChild("Throatslope_r1", CubeListBuilder.create().texOffs(55, 33).mirror().addBox(-4.5777F, -0.8732F, 10.4193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 34).mirror().addBox(-4.5777F, -0.8732F, 8.7193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, 0.0352F, -1.1522F, 0.0F, 0.4189F, 0.0F));

		PartDefinition Throatslope_r2 = Throat.addOrReplaceChild("Throatslope_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.2886F, -0.8732F, 3.6091F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, 0.0352F, -1.1522F, 0.0F, 0.1702F, 0.0F));

		PartDefinition Throatslope_r3 = Throat.addOrReplaceChild("Throatslope_r3", CubeListBuilder.create().texOffs(55, 33).addBox(3.5777F, -0.8732F, 10.4193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(3.5777F, -0.8732F, 8.7193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, 0.0F, -0.4189F, 0.0F));

		PartDefinition Throatslope_r4 = Throat.addOrReplaceChild("Throatslope_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.2886F, -0.8732F, 3.6091F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, 0.0F, -0.1702F, 0.0F));

		PartDefinition Throatslope_r5 = Throat.addOrReplaceChild("Throatslope_r5", CubeListBuilder.create().texOffs(0, 8).addBox(-3.3663F, -0.9038F, 0.026F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, -0.0044F, 0.0F, 0.0F));

		PartDefinition Throatslope_r6 = Throat.addOrReplaceChild("Throatslope_r6", CubeListBuilder.create().texOffs(15, 14).addBox(-3.3663F, -0.9067F, -0.9649F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, -0.2051F, 0.0F, 0.0F));

		PartDefinition Throatslope_r7 = Throat.addOrReplaceChild("Throatslope_r7", CubeListBuilder.create().texOffs(35, 20).mirror().addBox(-0.4353F, -0.823F, -1.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, 0.0352F, -1.1522F, -0.4088F, 0.7599F, -0.29F));

		PartDefinition Throatslope_r8 = Throat.addOrReplaceChild("Throatslope_r8", CubeListBuilder.create().texOffs(35, 20).addBox(-1.5647F, -0.823F, -1.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, -0.4088F, -0.7599F, 0.29F));

		PartDefinition Throatslope_r9 = Throat.addOrReplaceChild("Throatslope_r9", CubeListBuilder.create().texOffs(19, 10).addBox(-2.3663F, -0.823F, -1.9531F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.0352F, -1.1522F, -0.2923F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3151F, -4.2885F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(35, 10).mirror().addBox(-0.5761F, -0.3007F, -0.8635F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.8428F, -2.2545F, -0.5701F, -1.326F, -0.9696F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5011F, -0.4333F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 50).mirror().addBox(-0.5011F, -0.7083F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.8428F, -2.2545F, 3.0663F, -0.6354F, -0.1371F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.5011F, -0.7771F, -0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 50).mirror().addBox(-0.5011F, -0.5021F, -0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.8428F, -2.2545F, -2.7806F, -0.6354F, -0.1371F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.1932F, 1.8023F, -0.1429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -2.1288F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(40, 50).mirror().addBox(-0.5011F, -0.4757F, -0.8134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.8428F, -2.2545F, -1.5327F, -0.6354F, -0.1371F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.1932F, -0.4006F, -2.6518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(26, 37).mirror().addBox(-0.1932F, -0.7006F, -2.2518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -0.9507F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-0.1932F, -1.2273F, -1.9184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -0.6191F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.1932F, -1.5955F, -1.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -0.3049F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r9 = Upperjawfront.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(31, 16).mirror().addBox(-0.1932F, -1.8223F, -2.0211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -0.2875F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r10 = Upperjawfront.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-0.1932F, -1.7164F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.8858F, -0.204F, -0.1909F, -0.1129F, -0.4451F, 0.0F));

		PartDefinition Upperjawfront_r11 = Upperjawfront.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-0.2F, -0.6181F, -0.6132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(50, 33).mirror().addBox(-0.2F, -1.218F, -1.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(50, 30).mirror().addBox(-0.2F, -0.6181F, -1.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.3358F, -1.204F, 1.9591F, 0.6725F, -0.2094F, 0.0F));

		PartDefinition Upperjawfront_r12 = Upperjawfront.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(7, 21).mirror().addBox(-0.2F, -1.1779F, -2.6202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3358F, -1.204F, 1.9591F, 0.2012F, -0.2094F, 0.0F));

		PartDefinition Upperjawfront_r13 = Upperjawfront.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(0, 51).addBox(-0.4989F, -0.4333F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 50).addBox(-0.4989F, -0.7083F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.5069F, -0.8428F, -2.2545F, 3.0663F, 0.6354F, 0.1371F));

		PartDefinition Upperjawfront_r14 = Upperjawfront.addOrReplaceChild("Upperjawfront_r14", CubeListBuilder.create().texOffs(50, 47).addBox(-0.4989F, -0.7771F, -0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 50).addBox(-0.4989F, -0.5021F, -0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.5069F, -0.8428F, -2.2545F, -2.7806F, 0.6354F, 0.1371F));

		PartDefinition Upperjawfront_r15 = Upperjawfront.addOrReplaceChild("Upperjawfront_r15", CubeListBuilder.create().texOffs(25, 55).addBox(-0.8068F, 1.8023F, -0.1429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -2.1288F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r16 = Upperjawfront.addOrReplaceChild("Upperjawfront_r16", CubeListBuilder.create().texOffs(35, 10).addBox(-1.4239F, -0.3007F, -0.8635F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.5069F, -0.8428F, -2.2545F, -0.5701F, 1.326F, 0.9696F));

		PartDefinition Upperjawfront_r17 = Upperjawfront.addOrReplaceChild("Upperjawfront_r17", CubeListBuilder.create().texOffs(40, 50).addBox(-0.4989F, -0.4757F, -0.8134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.5069F, -0.8428F, -2.2545F, -1.5327F, 0.6354F, 0.1371F));

		PartDefinition Upperjawfront_r18 = Upperjawfront.addOrReplaceChild("Upperjawfront_r18", CubeListBuilder.create().texOffs(0, 38).addBox(-0.8068F, -0.4006F, -2.6518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(26, 37).addBox(-0.8068F, -0.7006F, -2.2518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -0.9507F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r19 = Upperjawfront.addOrReplaceChild("Upperjawfront_r19", CubeListBuilder.create().texOffs(21, 37).addBox(-0.8068F, -1.2273F, -1.9184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -0.6191F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r20 = Upperjawfront.addOrReplaceChild("Upperjawfront_r20", CubeListBuilder.create().texOffs(7, 37).addBox(-0.8068F, -1.5955F, -1.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -0.3049F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r21 = Upperjawfront.addOrReplaceChild("Upperjawfront_r21", CubeListBuilder.create().texOffs(31, 16).addBox(-0.8068F, -1.8223F, -2.0211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -0.2875F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r22 = Upperjawfront.addOrReplaceChild("Upperjawfront_r22", CubeListBuilder.create().texOffs(38, 16).addBox(-0.8068F, -1.7164F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8858F, -0.204F, -0.1909F, -0.1129F, 0.4451F, 0.0F));

		PartDefinition Upperjawfront_r23 = Upperjawfront.addOrReplaceChild("Upperjawfront_r23", CubeListBuilder.create().texOffs(35, 50).addBox(-0.8F, -0.6181F, -0.6132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(50, 33).addBox(-0.8F, -1.218F, -1.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(50, 30).addBox(-0.8F, -0.6181F, -1.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.3358F, -1.204F, 1.9591F, 0.6725F, 0.2094F, 0.0F));

		PartDefinition Upperjawfront_r24 = Upperjawfront.addOrReplaceChild("Upperjawfront_r24", CubeListBuilder.create().texOffs(7, 21).addBox(-0.8F, -1.1779F, -2.6202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3358F, -1.204F, 1.9591F, 0.2012F, 0.2094F, 0.0F));

		PartDefinition Upperjawslope2 = Upperjawfront.addOrReplaceChild("Upperjawslope2", CubeListBuilder.create().texOffs(20, 47).addBox(-0.5F, -0.2772F, -2.9862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.3F, 0.35F, 0.6487F, 0.0F, 0.0F));

		PartDefinition Upperjawslope8_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r1", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-0.325F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1481F, 1.1617F, -0.6571F, -0.09F, 0.762F, -1.0955F));

		PartDefinition Upperjawslope7_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r1", CubeListBuilder.create().texOffs(50, 24).mirror().addBox(-0.475F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1481F, 1.1617F, -0.6571F, -0.0698F, 0.3705F, -1.0586F));

		PartDefinition Upperjawslope7_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r2", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-1.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(20, 50).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3192F, 0.2918F, -2.0585F, -0.0654F, -0.1084F, -1.0262F));

		PartDefinition Upperjawslope5_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r1", CubeListBuilder.create().texOffs(14, 31).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2772F, -1.9862F, -0.1038F, -0.0724F, -0.6071F));

		PartDefinition Upperjawslope9_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r1", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.6379F, -0.0423F, -1.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4153F, 0.1096F, -2.9521F, -0.8304F, -0.2026F, 0.9793F));

		PartDefinition Upperjawslope8_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r2", CubeListBuilder.create().texOffs(30, 49).mirror().addBox(-0.6379F, -0.1978F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4153F, 0.1096F, -2.9521F, -0.4377F, -0.2026F, 0.9793F));

		PartDefinition Upperjawslope6_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r1", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-0.2F, -0.2201F, -0.7464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3021F, -2.9872F, -0.1143F, -0.1733F, 0.971F));

		PartDefinition Upperjawslope7_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r3", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9315F, 0.4724F, -2.3447F, 0.0F, -0.8727F, -0.6632F));

		PartDefinition Upperjawslope6_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r2", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-1.1F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2772F, -2.4862F, 0.0F, -0.5672F, -0.6632F));

		PartDefinition Upperjawslope5_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r2", CubeListBuilder.create().texOffs(47, 44).mirror().addBox(-0.85F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(40, 47).mirror().addBox(-1.15F, -0.175F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(35, 47).mirror().addBox(-0.85F, -0.175F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2772F, -2.4862F, 0.0F, 0.0F, -0.6632F));

		PartDefinition Upperjawslope7_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r4", CubeListBuilder.create().texOffs(50, 27).addBox(-0.675F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1481F, 1.1617F, -0.6571F, -0.09F, -0.762F, 1.0955F));

		PartDefinition Upperjawslope6_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r3", CubeListBuilder.create().texOffs(50, 24).addBox(-0.525F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1481F, 1.1617F, -0.6571F, -0.0698F, -0.3705F, 1.0586F));

		PartDefinition Upperjawslope6_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r4", CubeListBuilder.create().texOffs(50, 21).addBox(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(20, 50).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3192F, 0.2918F, -2.0585F, -0.0654F, 0.1084F, 1.0262F));

		PartDefinition Upperjawslope4_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r1", CubeListBuilder.create().texOffs(14, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2772F, -1.9862F, -0.1038F, 0.0724F, 0.6071F));

		PartDefinition Upperjawslope3_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r1", CubeListBuilder.create().texOffs(21, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2772F, -1.9862F, -0.1265F, 0.0F, 0.0F));

		PartDefinition Upperjawslope4_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r2", CubeListBuilder.create().texOffs(15, 50).addBox(-0.5F, -0.1951F, -1.1964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 48).addBox(-0.5F, -0.1951F, -0.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.3021F, -2.9872F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Upperjawslope5_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r3", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-0.2F, -0.1951F, -0.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(5, 50).mirror().addBox(-0.2F, -0.1951F, -1.1964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3021F, -2.9872F, 0.079F, -0.1044F, -0.0082F));

		PartDefinition Upperjawslope5_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r4", CubeListBuilder.create().texOffs(5, 50).addBox(-0.8F, -0.1951F, -1.1964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(48, 15).addBox(-0.8F, -0.1951F, -0.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, -0.3021F, -2.9872F, 0.079F, 0.1044F, 0.0082F));

		PartDefinition Upperjawslope8_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r3", CubeListBuilder.create().texOffs(50, 0).addBox(-0.3621F, -0.0423F, -1.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4153F, 0.1096F, -2.9521F, -0.8304F, 0.2026F, -0.9793F));

		PartDefinition Upperjawslope7_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r5", CubeListBuilder.create().texOffs(30, 49).addBox(-0.3621F, -0.1978F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4153F, 0.1096F, -2.9521F, -0.4377F, 0.2026F, -0.9793F));

		PartDefinition Upperjawslope5_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r5", CubeListBuilder.create().texOffs(25, 49).addBox(-0.8F, -0.2201F, -0.7464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3021F, -2.9872F, -0.1143F, 0.1733F, -0.971F));

		PartDefinition Upperjawslope6_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r5", CubeListBuilder.create().texOffs(0, 48).addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9315F, 0.4724F, -2.3447F, 0.0F, 0.8727F, 0.6632F));

		PartDefinition Upperjawslope5_r6 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r6", CubeListBuilder.create().texOffs(45, 47).addBox(0.1F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5F, -0.2772F, -2.4862F, 0.0F, 0.5672F, 0.6632F));

		PartDefinition Upperjawslope4_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r3", CubeListBuilder.create().texOffs(47, 44).addBox(-0.15F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 47).addBox(0.15F, -0.175F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 47).addBox(-0.15F, -0.175F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5F, -0.2772F, -2.4862F, 0.0F, 0.0F, 0.6632F));

		PartDefinition Upperjawslope1 = Upperjawback.addOrReplaceChild("Upperjawslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.425F, -0.075F, 0.44F, 0.0F, 0.0F));

		PartDefinition Upperjawslope12_r1 = Upperjawslope1.addOrReplaceChild("Upperjawslope12_r1", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-1.5218F, -0.3003F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 44).mirror().addBox(-0.9218F, -0.3003F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2489F, 3.5535F, -0.6753F, -0.2688F, 0.3317F, -1.4128F));

		PartDefinition Upperjawslope12_r2 = Upperjawslope1.addOrReplaceChild("Upperjawslope12_r2", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.625F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 4.1581F, -0.5703F, -0.4934F, 1.012F, -1.7512F));

		PartDefinition Upperjawslope8_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r4", CubeListBuilder.create().texOffs(37, 44).mirror().addBox(-0.075F, -0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.7853F, 1.0208F, -2.6184F, -0.0275F, 0.5211F, -0.9593F));

		PartDefinition Upperjawslope10_r1 = Upperjawslope1.addOrReplaceChild("Upperjawslope10_r1", CubeListBuilder.create().texOffs(14, 35).mirror().addBox(-1.7468F, -0.3003F, -0.0383F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4518F, 2.8772F, -2.0723F, -0.3295F, 0.6824F, -1.5358F));

		PartDefinition Upperjawslope9_r2 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r2", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-1.2968F, -0.3003F, -0.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0795F, 1.5322F, -1.9502F, -0.2901F, 0.4995F, -1.4654F));

		PartDefinition Upperjawslope9_r3 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r3", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-0.61F, -0.186F, -0.547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0795F, 1.5322F, -1.9502F, -0.1376F, -0.0626F, -1.1161F));

		PartDefinition Upperjawslope8_r5 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r5", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-0.7066F, -0.186F, -0.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0795F, 1.5322F, -1.9502F, -0.1613F, 0.5506F, -1.2097F));

		PartDefinition Upperjawslope7_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r6", CubeListBuilder.create().texOffs(41, 41).mirror().addBox(-0.225F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.734F, 1.7214F, -2.3201F, -0.0674F, 0.5178F, -1.0396F));

		PartDefinition Upperjawslope6_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r6", CubeListBuilder.create().texOffs(15, 44).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3192F, 0.5191F, -0.4783F, -0.0588F, -0.0919F, -1.0009F));

		PartDefinition Upperjawslope5_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r7", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.051F, -0.4158F, -0.0895F, -0.0625F, -0.6081F));

		PartDefinition Upperjawslope8_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r6", CubeListBuilder.create().texOffs(20, 44).addBox(-0.39F, -0.186F, -0.547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0795F, 1.5322F, -1.9502F, -0.1376F, 0.0626F, 1.1161F));

		PartDefinition Upperjawslope11_r1 = Upperjawslope1.addOrReplaceChild("Upperjawslope11_r1", CubeListBuilder.create().texOffs(0, 45).addBox(-0.375F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1607F, 4.1581F, -0.5703F, -0.4934F, -1.012F, 1.7512F));

		PartDefinition Upperjawslope11_r2 = Upperjawslope1.addOrReplaceChild("Upperjawslope11_r2", CubeListBuilder.create().texOffs(45, 0).addBox(0.5218F, -0.3003F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 44).addBox(-0.0782F, -0.3003F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2489F, 3.5535F, -0.6753F, -0.2688F, -0.3317F, 1.4128F));

		PartDefinition Upperjawslope9_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r4", CubeListBuilder.create().texOffs(14, 35).addBox(-0.2532F, -0.3003F, -0.0383F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4518F, 2.8772F, -2.0723F, -0.3295F, -0.6824F, 1.5358F));

		PartDefinition Upperjawslope8_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r7", CubeListBuilder.create().texOffs(55, 0).addBox(0.2968F, -0.3003F, -0.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0795F, 1.5322F, -1.9502F, -0.2901F, -0.4995F, 1.4654F));

		PartDefinition Upperjawslope7_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r7", CubeListBuilder.create().texOffs(55, 51).addBox(-0.2934F, -0.186F, -0.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0795F, 1.5322F, -1.9502F, -0.1613F, -0.5506F, 1.2097F));

		PartDefinition Upperjawslope7_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r8", CubeListBuilder.create().texOffs(37, 44).addBox(-0.925F, -0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.7853F, 1.0208F, -2.6184F, -0.0275F, -0.5211F, 0.9593F));

		PartDefinition Upperjawslope6_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r7", CubeListBuilder.create().texOffs(41, 41).addBox(-0.775F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.734F, 1.7214F, -2.3201F, -0.0674F, -0.5178F, 1.0396F));

		PartDefinition Upperjawslope5_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r8", CubeListBuilder.create().texOffs(15, 44).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3192F, 0.5191F, -0.4783F, -0.0588F, 0.0919F, 1.0009F));

		PartDefinition Upperjawslope4_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope4_r4", CubeListBuilder.create().texOffs(5, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.051F, -0.4158F, -0.0895F, 0.0625F, 0.6081F));

		PartDefinition Upperjawslope3_r2 = Upperjawslope1.addOrReplaceChild("Upperjawslope3_r2", CubeListBuilder.create().texOffs(43, 15).addBox(-0.5F, 0.0705F, -0.9892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0678F, 0.0782F, -0.1091F, 0.0F, 0.0F));

		PartDefinition Rightcheekslope = Upperjawback.addOrReplaceChild("Rightcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1028F, 3.8027F, 1.9714F, 0.5527F, -0.1125F, -0.0311F));

		PartDefinition Leftcheekslope_r1 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r1", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.3591F, 1.166F, -0.3522F, -0.9032F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r2 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r2", CubeListBuilder.create().texOffs(45, 23).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4381F, 1.7661F, 0.4438F, -0.6501F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r3 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r3", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4927F, 2.1812F, 1.3519F, -0.432F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r4 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r4", CubeListBuilder.create().texOffs(12, 38).mirror().addBox(-0.5F, -1.625F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4427F, 1.8009F, 1.7437F, 0.0218F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r5 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r5", CubeListBuilder.create().texOffs(10, 45).mirror().addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.3418F, 1.0345F, 2.3781F, 0.24F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r6 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r6", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3418F, 1.0345F, 2.3781F, 0.589F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r7 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r7", CubeListBuilder.create().texOffs(14, 22).mirror().addBox(0.4919F, -0.4766F, -0.1513F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1779F, -0.2138F, 0.3178F, 0.4581F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r8 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r8", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(0.4919F, -0.5766F, -0.3763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.1779F, -0.2138F, 0.3178F, 0.2836F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r9 = Rightcheekslope.addOrReplaceChild("Leftcheekslope_r9", CubeListBuilder.create().texOffs(27, 43).mirror().addBox(0.4919F, -0.5016F, -1.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1779F, -0.2138F, 0.3178F, 0.1091F, 0.0F, 0.1309F));

		PartDefinition Rightcheekslope_r1 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r1", CubeListBuilder.create().texOffs(45, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1535F, 1.166F, -0.3522F, -0.9032F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r2 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r2", CubeListBuilder.create().texOffs(45, 23).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2325F, 1.7661F, 0.4438F, -0.6501F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r3 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r3", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2872F, 2.1812F, 1.3519F, -0.432F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r4 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r4", CubeListBuilder.create().texOffs(12, 38).addBox(-0.5F, -1.625F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2371F, 1.8009F, 1.7437F, 0.0218F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r5 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r5", CubeListBuilder.create().texOffs(10, 45).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1362F, 1.0345F, 2.3781F, 0.24F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r6 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r6", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1362F, 1.0345F, 2.3781F, 0.589F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r7 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r7", CubeListBuilder.create().texOffs(14, 22).addBox(-1.4919F, -0.4766F, -0.1513F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9723F, -0.2138F, 0.3178F, 0.4581F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r8 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r8", CubeListBuilder.create().texOffs(35, 35).addBox(-1.4919F, -0.5766F, -0.3763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9723F, -0.2138F, 0.3178F, 0.2836F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r9 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r9", CubeListBuilder.create().texOffs(27, 43).addBox(-1.4919F, -0.5016F, -1.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9723F, -0.2138F, 0.3178F, 0.1091F, 0.0F, -0.1309F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offset(0.0F, 5.7877F, -0.9891F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(51, 39).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 39).addBox(2.6517F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5758F, 1.0836F, 0.3614F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(15, 17).mirror().addBox(0.0F, 0.1498F, -3.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, 0.4328F, -1.5538F, 0.0175F, -0.0698F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(51, 36).addBox(2.6517F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5758F, 1.442F, -0.5721F, 0.192F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r4 = Lowerjawback.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(10, 51).addBox(2.6517F, -1.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5758F, 0.5389F, 1.2001F, 0.576F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r5 = Lowerjawback.addOrReplaceChild("Lowerjawback_r5", CubeListBuilder.create().texOffs(7, 26).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(7, 26).addBox(2.6517F, -0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5758F, -0.5303F, -0.7638F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r6 = Lowerjawback.addOrReplaceChild("Lowerjawback_r6", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0028F, -0.1479F, 0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 39).mirror().addBox(0.0028F, 0.1521F, 0.23F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -1.7628F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r7 = Lowerjawback.addOrReplaceChild("Lowerjawback_r7", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(0.0028F, -0.5315F, -3.6285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.0524F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r8 = Lowerjawback.addOrReplaceChild("Lowerjawback_r8", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(0.0028F, 3.9134F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(36, 39).mirror().addBox(0.0028F, 2.7134F, -0.7723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -1.4835F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r9 = Lowerjawback.addOrReplaceChild("Lowerjawback_r9", CubeListBuilder.create().texOffs(42, 3).mirror().addBox(0.0028F, 1.712F, -2.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 12).mirror().addBox(0.0028F, 2.012F, -2.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -1.0297F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r10 = Lowerjawback.addOrReplaceChild("Lowerjawback_r10", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.0028F, 3.0526F, -2.8613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 54).mirror().addBox(0.0028F, 2.5776F, -2.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2034F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.9774F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r11 = Lowerjawback.addOrReplaceChild("Lowerjawback_r11", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(0.0028F, 1.9335F, -3.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.8203F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r12 = Lowerjawback.addOrReplaceChild("Lowerjawback_r12", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(0.0028F, 0.234F, -3.6545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.2618F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r13 = Lowerjawback.addOrReplaceChild("Lowerjawback_r13", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(0.0028F, 0.7141F, -2.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.4363F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r14 = Lowerjawback.addOrReplaceChild("Lowerjawback_r14", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(0.0028F, -0.0408F, -2.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, -0.2182F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r15 = Lowerjawback.addOrReplaceChild("Lowerjawback_r15", CubeListBuilder.create().texOffs(21, 26).mirror().addBox(0.0028F, -0.4436F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8758F, 0.4328F, -4.4538F, 0.0F, -0.2443F, 0.0F));

		PartDefinition Lowerjawback_r16 = Lowerjawback.addOrReplaceChild("Lowerjawback_r16", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(0.0F, -0.8188F, -2.8893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, 0.4328F, -1.5538F, 0.1309F, -0.0698F, 0.0F));

		PartDefinition Lowerjawback_r17 = Lowerjawback.addOrReplaceChild("Lowerjawback_r17", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(0.0F, -0.8612F, -0.9548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, 0.4328F, -1.5538F, 0.1745F, -0.0698F, 0.0F));

		PartDefinition Lowerjawback_r18 = Lowerjawback.addOrReplaceChild("Lowerjawback_r18", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-0.5F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 18).addBox(2.6517F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5758F, 0.3154F, -1.5286F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r19 = Lowerjawback.addOrReplaceChild("Lowerjawback_r19", CubeListBuilder.create().texOffs(15, 17).addBox(-1.0F, 0.1498F, -3.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0758F, 0.4328F, -1.5538F, 0.0175F, 0.0698F, 0.0F));

		PartDefinition Lowerjawback_r20 = Lowerjawback.addOrReplaceChild("Lowerjawback_r20", CubeListBuilder.create().texOffs(52, 3).addBox(-1.0028F, -0.1479F, 0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 39).addBox(-1.0028F, 0.1521F, 0.23F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -1.7628F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r21 = Lowerjawback.addOrReplaceChild("Lowerjawback_r21", CubeListBuilder.create().texOffs(55, 30).addBox(-1.0028F, -0.5315F, -3.6285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.0524F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r22 = Lowerjawback.addOrReplaceChild("Lowerjawback_r22", CubeListBuilder.create().texOffs(52, 6).addBox(-1.0028F, 3.9134F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(36, 39).addBox(-1.0028F, 2.7134F, -0.7723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -1.4835F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r23 = Lowerjawback.addOrReplaceChild("Lowerjawback_r23", CubeListBuilder.create().texOffs(42, 3).addBox(-1.0028F, 1.712F, -2.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 12).addBox(-1.0028F, 2.012F, -2.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -1.0297F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r24 = Lowerjawback.addOrReplaceChild("Lowerjawback_r24", CubeListBuilder.create().texOffs(40, 32).addBox(-1.0028F, 3.0526F, -2.8613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 54).addBox(-1.0028F, 2.5776F, -2.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2034F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.9774F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r25 = Lowerjawback.addOrReplaceChild("Lowerjawback_r25", CubeListBuilder.create().texOffs(50, 53).addBox(-1.0028F, 1.9335F, -3.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.8203F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r26 = Lowerjawback.addOrReplaceChild("Lowerjawback_r26", CubeListBuilder.create().texOffs(55, 54).addBox(-1.0028F, 0.234F, -3.6545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.2618F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r27 = Lowerjawback.addOrReplaceChild("Lowerjawback_r27", CubeListBuilder.create().texOffs(30, 55).addBox(-1.0028F, 0.7141F, -2.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.4363F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r28 = Lowerjawback.addOrReplaceChild("Lowerjawback_r28", CubeListBuilder.create().texOffs(55, 27).addBox(-1.0028F, -0.0408F, -2.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, -0.2182F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r29 = Lowerjawback.addOrReplaceChild("Lowerjawback_r29", CubeListBuilder.create().texOffs(21, 26).addBox(-1.0028F, -0.4436F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8758F, 0.4328F, -4.4538F, 0.0F, 0.2443F, 0.0F));

		PartDefinition Lowerjawback_r30 = Lowerjawback.addOrReplaceChild("Lowerjawback_r30", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -0.8188F, -2.8893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0758F, 0.4328F, -1.5538F, 0.1309F, 0.0698F, 0.0F));

		PartDefinition Lowerjawback_r31 = Lowerjawback.addOrReplaceChild("Lowerjawback_r31", CubeListBuilder.create().texOffs(52, 9).addBox(-1.0F, -0.8612F, -0.9548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0758F, 0.4328F, -1.5538F, 0.1745F, 0.0698F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 60);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}