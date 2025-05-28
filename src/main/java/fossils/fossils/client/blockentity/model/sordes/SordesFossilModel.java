package fossils.fossils.client.blockentity.model.sordes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SordesFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing7;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing7;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SordesFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftWing = this.main.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing7 = this.leftWing4.getChild("leftWing7");
		this.leftWing5 = this.leftWing7.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.main.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing7 = this.rightWing4.getChild("rightWing7");
		this.rightWing5 = this.rightWing7.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.neck = this.main.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.35F, -2.5F, -0.9331F, -0.491F, 0.2602F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 67).mirror().addBox(-1.5F, 0.7996F, 0.0553F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 73).addBox(0.0F, -0.2004F, 0.0553F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 67).addBox(0.5F, 0.7996F, 0.0553F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 29).addBox(-0.5F, -0.0004F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.05F, 6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-0.4358F, -0.8968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(66, 45).mirror().addBox(-0.4358F, -1.3968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0981F, 1.5359F, 7.7588F, 0.4303F, 0.2106F, -0.0573F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-1.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -0.9068F, 5.0685F, -0.2413F, -0.125F, -0.6028F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-1.9687F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -0.9068F, 5.0685F, -0.1668F, -0.2148F, -1.0363F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-1.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -0.5068F, -0.6065F, 0.3711F, 0.2877F, -0.6202F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-1.9687F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -0.5068F, -0.6065F, 0.2151F, 0.4161F, -1.0653F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-2.3334F, -1.5184F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 3.1685F, -0.035F, -0.0102F, -1.6603F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-1.9687F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 3.1685F, -0.0345F, 0.0117F, -1.0498F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-1.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 3.1685F, -0.0263F, 0.0252F, -0.6136F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-0.4491F, -0.5157F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.5211F, 5.8141F, -0.4036F, 0.6475F, -1.9337F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-1.5455F, -0.5F, -0.7035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6711F, 5.8141F, 0.1321F, 0.3029F, 0.0396F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.139F, 1.5243F, 6.5064F, 0.4053F, 0.1346F, -0.1008F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 34).mirror().addBox(-0.5F, -0.5335F, -0.2271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1576F, 1.1664F, 7.2995F, -0.1669F, 0.218F, -0.0097F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-0.5F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.1576F, 1.1664F, 7.2995F, -0.0447F, 0.218F, -0.0097F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-0.8F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0742F, 6.9062F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-1.2028F, -0.7397F, -1.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1742F, 5.0062F, -0.5995F, 0.2106F, -0.0573F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0332F, -0.1289F, 8.0667F, 0.283F, 0.2154F, 0.0347F));

		PartDefinition cube_r18 = main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9552F, -0.0262F, 8.3601F, 0.4575F, 0.2154F, 0.0347F));

		PartDefinition cube_r19 = main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 60).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.162F, 0.0966F, 7.5388F, -0.0584F, 0.2106F, -0.0573F));

		PartDefinition cube_r20 = main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(39, 15).mirror().addBox(-0.8F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0742F, 6.9062F, -0.3202F, 0.2106F, -0.0573F));

		PartDefinition cube_r21 = main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-1.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 0.9935F, 0.1463F, 0.1448F, -0.5989F));

		PartDefinition cube_r22 = main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-1.9687F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 0.9935F, 0.0711F, 0.193F, -1.039F));

		PartDefinition cube_r23 = main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 25).mirror().addBox(-2.3334F, -1.5184F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, -1.1067F, 0.9935F, -0.0539F, 0.1984F, -1.6621F));

		PartDefinition cube_r24 = main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 62).mirror().addBox(-0.5F, -1.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5029F, 1.5304F, -0.5706F, 0.8117F, 0.7794F, -0.4117F));

		PartDefinition cube_r25 = main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-3.2449F, -0.8858F, -0.7101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.4F, -0.8F, 0.5725F, 0.5173F, 0.2532F));

		PartDefinition cube_r26 = main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-3.2917F, -0.8275F, -1.6273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.4F, -0.8F, 0.7306F, 0.3503F, 0.1589F));

		PartDefinition cube_r27 = main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.375F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1594F, 1.7181F, 1.6621F, 0.0067F, -0.1011F, 0.3749F));

		PartDefinition cube_r28 = main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-1.7565F, -0.8584F, -0.3803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1719F, 2.4927F, 0.7323F, 0.0226F, 0.3957F, 0.2683F));

		PartDefinition cube_r29 = main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 48).addBox(-0.5508F, -0.5157F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(1.2F, 1.5211F, 5.8141F, -0.4036F, -0.6475F, 1.9337F));

		PartDefinition cube_r30 = main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(62, 14).addBox(-0.4545F, -0.5F, -0.7035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.0F, 1.6711F, 5.8141F, 0.1321F, -0.3029F, -0.0396F));

		PartDefinition cube_r31 = main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 52).addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.139F, 1.5243F, 6.5064F, 0.4053F, -0.1346F, 0.1008F));

		PartDefinition cube_r32 = main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 61).addBox(-0.5642F, -0.8968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(66, 45).addBox(-0.5642F, -1.3968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0981F, 1.5359F, 7.7588F, 0.4303F, -0.2106F, 0.0573F));

		PartDefinition cube_r33 = main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 34).addBox(-0.5F, -0.5335F, -0.2271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1576F, 1.1664F, 7.2995F, -0.1669F, -0.218F, 0.0097F));

		PartDefinition cube_r34 = main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 31).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.1576F, 1.1664F, 7.2995F, -0.0447F, -0.218F, 0.0097F));

		PartDefinition cube_r35 = main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 28).addBox(-0.2F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.0742F, 6.9062F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r36 = main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 71).addBox(0.2028F, -0.7397F, -1.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, -0.1742F, 5.0062F, -0.5995F, -0.2106F, 0.0573F));

		PartDefinition cube_r37 = main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 25).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0332F, -0.1289F, 8.0667F, 0.283F, -0.2154F, -0.0347F));

		PartDefinition cube_r38 = main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9552F, -0.0262F, 8.3601F, 0.4575F, -0.2154F, -0.0347F));

		PartDefinition cube_r39 = main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 60).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.162F, 0.0966F, 7.5388F, -0.0584F, -0.2106F, 0.0573F));

		PartDefinition cube_r40 = main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 15).addBox(-0.2F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0F, -0.0742F, 6.9062F, -0.3202F, -0.2106F, 0.0573F));

		PartDefinition cube_r41 = main.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(23, 73).addBox(0.0F, -0.506F, 0.9549F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 10).addBox(-0.5F, -0.2059F, -0.0451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.25F, 3.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r42 = main.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 73).addBox(0.0F, -0.4826F, -1.0393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 73).addBox(0.0F, -0.4826F, -3.0393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 5).addBox(-0.5F, -0.1826F, -3.0393F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, 3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r43 = main.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(32, 21).addBox(-1.5F, -1.149F, -3.2652F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, 5.3F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r44 = main.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 71).addBox(0.9688F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -0.9068F, 5.0685F, -0.1668F, 0.2148F, 1.0363F));

		PartDefinition cube_r45 = main.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(70, 71).addBox(0.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -0.9068F, 5.0685F, -0.2413F, 0.125F, 0.6028F));

		PartDefinition cube_r46 = main.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 49).addBox(0.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 3.1685F, -0.0263F, -0.0252F, 0.6136F));

		PartDefinition cube_r47 = main.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(55, 71).addBox(0.9688F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 3.1685F, -0.0345F, -0.0117F, 1.0498F));

		PartDefinition cube_r48 = main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 71).addBox(1.3334F, -1.5184F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 3.1685F, -0.035F, 0.0102F, 1.6603F));

		PartDefinition cube_r49 = main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 60).addBox(0.9688F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -0.5068F, -0.6065F, 0.2151F, -0.4161F, 1.0653F));

		PartDefinition cube_r50 = main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 62).addBox(0.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -0.5068F, -0.6065F, 0.3711F, -0.2877F, 0.6202F));

		PartDefinition cube_r51 = main.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 35).addBox(0.0795F, -0.0227F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 0.9935F, 0.1463F, -0.1448F, 0.5989F));

		PartDefinition cube_r52 = main.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 18).addBox(0.9688F, -0.4768F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 0.9935F, 0.0711F, -0.193F, 1.039F));

		PartDefinition cube_r53 = main.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 25).addBox(1.3334F, -1.5184F, -0.6935F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, -1.1067F, 0.9935F, -0.0539F, -0.1984F, 1.6621F));

		PartDefinition cube_r54 = main.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 62).addBox(-0.5F, -1.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5029F, 1.5304F, -0.5706F, 0.8117F, -0.7794F, 0.4117F));

		PartDefinition cube_r55 = main.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 52).addBox(2.2449F, -0.8858F, -0.7101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.4F, -0.8F, 0.5725F, -0.5173F, -0.2532F));

		PartDefinition cube_r56 = main.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(14, 52).addBox(2.2917F, -0.8275F, -1.6273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.4F, -0.8F, 0.7306F, -0.3503F, -0.1589F));

		PartDefinition cube_r57 = main.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(62, 11).addBox(-1.625F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1594F, 1.7181F, 1.6621F, 0.0067F, 0.1011F, -0.3749F));

		PartDefinition cube_r58 = main.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 8).addBox(-0.2435F, -0.8584F, -0.3803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1719F, 2.4927F, 0.7323F, 0.0226F, -0.3957F, -0.2683F));

		PartDefinition cube_r59 = main.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 73).addBox(-1.3321F, 0.3848F, -1.5618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3281F, 1.5927F, 0.6323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r60 = main.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 38).addBox(-1.8281F, 0.0937F, -1.1854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3281F, 1.5927F, 0.6323F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r61 = main.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(26, 73).addBox(0.0F, -0.2018F, -1.9099F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 60).addBox(-0.5F, 0.0982F, -1.9099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r62 = main.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(37, 64).addBox(-0.5F, 0.4313F, -2.6593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftWing = main.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, 0.85F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 60).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9063F, 0.3217F, -0.4464F, -0.1909F, 0.1119F, -2.6791F));

		PartDefinition cube_r63 = leftWing.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(63, 53).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(34, 8).addBox(-0.7001F, -0.1808F, -0.0248F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 37).addBox(-0.7001F, -0.1808F, -0.8248F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2761F, 4.5344F, -0.9115F, -0.3405F, 0.0123F, -0.0407F));

		PartDefinition cube_r64 = leftWing2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 20).addBox(-0.5F, -2.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2001F, 7.9458F, -1.1263F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(49, 62).addBox(-0.9656F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 7.7173F, 0.165F, 0.3097F, 0.0484F, 0.1514F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(47, 41).addBox(-0.3666F, -1.9212F, -0.4992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.437F, 2.5451F, -0.0302F, 1.124F, -0.0427F, -3.1095F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(17, 21).addBox(-1.0127F, -0.4045F, -0.472F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1275F, 2.7906F, 0.2577F, -1.5311F, 0.5051F, 0.1059F));

		PartDefinition leftWing7 = leftWing4.addOrReplaceChild("leftWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5127F, 0.0955F, 5.428F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r65 = leftWing7.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing5 = leftWing7.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1582F, -0.8639F, 5.1911F, 0.0826F, -0.2075F, -0.0505F));

		PartDefinition cube_r66 = leftWing5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1082F, -0.2042F, 2.9052F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(17, 12).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0789F, -1.2427F, 6.5469F, 0.3923F, -0.1455F, -0.0965F));

		PartDefinition rightWing = main.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(63, 37).mirror().addBox(-0.5F, 0.85F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 60).mirror().addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9063F, 0.3217F, -0.4464F, -0.1909F, -0.1119F, 2.6791F));

		PartDefinition cube_r67 = rightWing.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 53).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-0.2999F, -0.1808F, -0.0248F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 37).mirror().addBox(-0.2999F, -0.1808F, -0.8248F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2761F, 4.5344F, -0.9115F, -0.3405F, -0.0123F, 0.0407F));

		PartDefinition cube_r68 = rightWing2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-0.5F, -2.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2001F, 7.9458F, -1.1263F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(-0.0344F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0091F, 7.7173F, 0.165F, 0.3097F, -0.0484F, -0.1514F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-0.6334F, -1.9212F, -0.4992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.437F, 2.5451F, -0.0302F, 1.124F, 0.0427F, 3.1095F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(17, 21).mirror().addBox(0.0127F, -0.4045F, -0.472F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, 2.7906F, 0.2577F, -1.5311F, -0.5051F, -0.1059F));

		PartDefinition rightWing7 = rightWing4.addOrReplaceChild("rightWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5127F, 0.0955F, 5.428F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r69 = rightWing7.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing5 = rightWing7.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1582F, -0.8639F, 5.1911F, 0.0826F, 0.2075F, 0.0505F));

		PartDefinition cube_r70 = rightWing5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1082F, -0.2042F, 2.9052F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0789F, -1.2427F, 6.5469F, 0.3923F, 0.1455F, 0.0965F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(47, 46).addBox(-0.8709F, -0.1555F, -0.464F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8529F, 0.2138F, 7.2672F, 0.9165F, -0.2135F, -1.4312F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(-0.4709F, 0.8445F, 1.536F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(9, 38).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0088F, 4.9225F, -0.4113F, 0.7862F, 0.2565F, 0.1924F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(32, 33).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.536F, 5.647F, 0.3961F, 0.3246F, 0.1579F, -0.1753F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.3F, -1.0578F, 0.4084F, -1.1074F));

		PartDefinition cube_r71 = finger.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 60).addBox(-0.4984F, -0.5F, -1.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7F, 0.0F, -1.0F, 0.0F, 1.7977F, 0.0F));

		PartDefinition cube_r72 = finger.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 43).addBox(-0.6545F, -0.5F, -2.892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.1F, 0.0F, 1.1694F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(23, 8).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0133F, -2.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.1291F, -0.1555F, -0.464F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8529F, 0.2138F, 7.2672F, 0.9165F, 0.2135F, 1.4312F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.4709F, 0.8445F, 1.536F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0088F, 4.9225F, -0.4113F, 0.7862F, -0.2565F, -0.1924F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(32, 33).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.536F, 5.647F, 0.3961F, 0.3246F, -0.1579F, 0.1753F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, 0.3F, -1.0578F, -0.4084F, 1.1074F));

		PartDefinition cube_r73 = finger2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-0.5016F, -0.5F, -1.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7F, 0.0F, -1.0F, 0.0F, -1.7977F, 0.0F));

		PartDefinition cube_r74 = finger2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.3454F, -0.5F, -2.892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.1F, 0.0F, -1.1694F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(23, 8).mirror().addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0133F, -2.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, -2.15F, -0.0655F, -0.0268F, 0.1725F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(20, 73).addBox(0.0F, -1.22F, -0.0396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 33).addBox(-0.5F, -1.02F, -1.0396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.557F, -0.8508F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4682F, -1.7841F, -0.1353F, 0.4292F, 0.0181F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(73, 20).addBox(0.0F, -1.1782F, -1.8438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 73).addBox(0.0F, -1.2782F, 0.1562F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 38).addBox(-0.5F, -0.8782F, -1.8438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1888F, -1.1666F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, -0.4608F, 0.1393F, 0.2727F));

		PartDefinition cube_r77 = neck3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(20, 43).addBox(-0.5F, -0.9F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.5498F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3708F, -2.1222F, 1.0515F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.5039F, -0.4918F, -0.5104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(59, 65).mirror().addBox(-0.5039F, -0.3668F, -0.5104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4055F)).mirror(false), PartPose.offsetAndRotation(-0.0688F, -0.2378F, -10.2784F, -0.3998F, 0.2997F, 0.3134F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.4961F, -0.6302F, -0.5301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0688F, -0.2378F, -10.2784F, -0.7052F, 0.2997F, 0.3134F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.5039F, -0.3271F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(70, 15).mirror().addBox(-0.5039F, -0.5021F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.1734F, -0.0604F, -9.3818F, -0.2719F, 0.2546F, 0.3542F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.4961F, -0.6715F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1734F, -0.0604F, -9.3818F, -0.4464F, 0.2546F, 0.3542F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.5039F, -0.3271F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(69, 64).mirror().addBox(-0.5039F, -0.5021F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.2234F, 0.0646F, -8.4318F, 0.0183F, 0.143F, 0.4084F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.4536F, -0.7366F, -1.6835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.358F)).mirror(false), PartPose.offsetAndRotation(-0.15F, -0.1014F, -8.1132F, -0.0696F, -0.0774F, -0.0068F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.4536F, -1.0305F, -1.5532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.15F, -0.1014F, -8.1132F, 0.1136F, -0.0774F, -0.0068F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.4961F, -0.6715F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2234F, 0.0646F, -8.4318F, -0.1562F, 0.143F, 0.4084F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5589F, -0.1941F, 0.2186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.2259F, -0.1455F, -8.2486F, 0.1661F, 0.0443F, 0.425F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-0.551F, -0.4928F, 0.2373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2259F, -0.1455F, -8.2486F, -0.0084F, 0.0443F, 0.425F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.613F, -0.4907F, 0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.0047F, 0.0429F, 0.2943F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-0.6209F, -0.0709F, 0.9049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, 0.1699F, 0.0429F, 0.2943F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(49, 54).mirror().addBox(-0.3281F, -0.6694F, 0.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.009F, -0.1309F, 0.0031F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 9).mirror().addBox(-0.3575F, -0.7406F, -0.335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(55, 5).mirror().addBox(-0.3575F, -0.6406F, -0.335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, 0.0222F, -0.1089F, -0.0055F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 29).mirror().addBox(-0.3623F, -0.3292F, -0.3926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.2187F, -0.0686F, -0.0114F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(21, 56).mirror().addBox(-0.3623F, -0.3292F, -0.3926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.2195F, -0.1384F, -0.0114F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-0.3872F, -0.3028F, 0.8284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.2358F, -0.0531F, -0.0035F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-0.3872F, -0.3028F, 0.8284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.236F, -0.1229F, -0.0035F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-0.3805F, -0.3759F, 2.0565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.2008F, -0.0522F, -0.0038F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(25, 48).mirror().addBox(-0.3805F, -0.3759F, 2.0565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.2014F, -7.7382F, 0.2011F, -0.122F, -0.0038F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.8005F, -3.2291F, 0.2234F, -0.0851F, -0.0193F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.4929F, -0.5579F, -1.6334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(-0.4704F, -1.4825F, -4.292F, 0.2072F, -0.13F, -0.1264F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.5006F, -0.4831F, -0.8554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(-0.4704F, -1.4825F, -4.292F, -0.0985F, -0.1602F, -0.0514F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(63, 57).mirror().addBox(-0.3172F, -0.3968F, -0.7854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.4509F, -0.6455F, -6.8986F, 1.7619F, -0.0238F, -0.0757F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(-0.3172F, -0.2989F, -0.4063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.34F)).mirror(false)
				.texOffs(47, 0).mirror().addBox(-0.3172F, -0.1989F, -0.4063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-0.4509F, -0.6455F, -6.8986F, 0.4966F, -0.0238F, -0.0757F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-0.3172F, 0.5231F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F)).mirror(false), PartPose.offsetAndRotation(-0.4509F, -0.6455F, -6.8986F, 1.2383F, -0.0238F, -0.0757F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-0.3279F, -0.9355F, 0.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.1133F, -0.1303F, -0.0028F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.8786F, -0.8595F, 1.596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.2146F, 0.1041F, 0.2721F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.8865F, -0.3193F, 1.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.04F, 0.1041F, 0.2721F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-1.2972F, -1.8742F, 1.9301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.5569F, 0.1883F, 0.2109F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 32).mirror().addBox(-0.3281F, -0.8476F, 1.1679F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.0788F, -0.1309F, 0.0031F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-0.3281F, -1.2229F, 3.3369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2509F, -0.1955F, -8.1736F, -0.1791F, -0.1309F, 0.0031F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-0.9F, -0.3084F, -0.2409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false)
				.texOffs(73, 74).addBox(-0.1F, -0.3084F, -0.2409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F))
				.texOffs(54, 41).addBox(-1.0F, -0.2834F, -0.2409F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -2.203F, 0.6063F, -0.589F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-0.5F, -0.775F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false)
				.texOffs(73, 74).addBox(0.3F, -0.775F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.4F, -1.2062F, 0.8532F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(71, 29).addBox(0.638F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.569F, -0.3741F, -2.9314F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-0.1315F, -3.7666F, 1.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(71, 23).mirror().addBox(-0.3415F, -3.7666F, 1.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 23).addBox(0.7665F, -3.7666F, 1.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 26).addBox(0.5565F, -3.7666F, 1.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.7125F, 2.2574F, -4.1406F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(71, 32).addBox(0.638F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.569F, 0.0939F, -2.7702F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-0.444F, -0.1603F, -0.1662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(52, 25).addBox(0.694F, -0.1603F, -0.1662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.625F, -0.8638F, -3.6303F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.5F, -0.1191F, -0.1835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(15, 67).addBox(0.638F, -0.1191F, -0.1835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.569F, -1.5562F, -3.4788F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.5F, -0.35F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 67).addBox(0.638F, -0.35F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.569F, -1.4742F, -3.1794F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.575F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1498F)).mirror(false)
				.texOffs(0, 48).addBox(0.638F, -0.575F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(-0.569F, -1.7914F, -2.1398F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.5F, -1.525F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1495F)).mirror(false)
				.texOffs(48, 5).addBox(0.638F, -1.525F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1495F)), PartPose.offsetAndRotation(-0.569F, -0.4309F, -1.5645F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.5F, -0.45F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 67).addBox(0.638F, -0.45F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.569F, -1.8612F, -1.0017F, -0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-0.5F, -0.1221F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(69, 9).addBox(0.638F, -0.1221F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.569F, -2.0612F, -0.7017F, -1.1825F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-0.5F, -0.1221F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 12).addBox(0.638F, -0.1221F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.569F, -1.4133F, -0.4367F, -1.8457F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-0.5F, -0.6F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6291F, 0.1884F, -0.8774F, 0.7243F, -0.0008F, 0.0011F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 53).addBox(0.8F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.65F, 0.9556F, -1.3379F, -2.0551F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(48, 10).addBox(0.5F, -0.4F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.5F, -0.3897F, -0.1402F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(10, 70).addBox(-0.4961F, -0.3271F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(70, 15).addBox(-0.4961F, -0.5021F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.1734F, -0.0604F, -9.3818F, -0.2719F, -0.2546F, -0.3542F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 70).addBox(-0.5039F, -0.6715F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1734F, -0.0604F, -9.3818F, -0.4464F, -0.2546F, -0.3542F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(5, 70).addBox(-0.4961F, -0.3271F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(69, 64).addBox(-0.4961F, -0.5021F, -0.5073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.2234F, 0.0646F, -8.4318F, 0.0183F, -0.143F, -0.4084F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5039F, -0.6715F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2234F, 0.0646F, -8.4318F, -0.1562F, -0.143F, -0.4084F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 70).addBox(0.2972F, -1.8742F, 1.9301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.5569F, -0.1883F, -0.2109F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(25, 70).addBox(-0.1135F, -0.3193F, 1.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.04F, -0.1041F, -0.2721F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 70).addBox(-0.1214F, -0.8595F, 1.596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.2146F, -0.1041F, -0.2721F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 70).addBox(-0.3791F, -0.0709F, 0.9049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, 0.1699F, -0.0429F, -0.2943F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(20, 70).addBox(-0.387F, -0.4907F, 0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.0047F, -0.0429F, -0.2943F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 68).addBox(-0.4411F, -0.1941F, 0.2186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.2259F, -0.1455F, -8.2486F, 0.1661F, -0.0443F, -0.425F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(52, 67).addBox(-0.449F, -0.4928F, 0.2373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2259F, -0.1455F, -8.2486F, -0.0084F, -0.0443F, -0.425F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(59, 65).addBox(-0.4961F, -0.3668F, -0.5104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4055F))
				.texOffs(42, 65).addBox(-0.4961F, -0.4918F, -0.5104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.0688F, -0.2378F, -10.2784F, -0.3998F, -0.2997F, -0.3134F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5039F, -0.6302F, -0.5301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0688F, -0.2378F, -10.2784F, -0.7052F, -0.2997F, -0.3134F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 56).addBox(-0.5F, -0.475F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0009F, -0.4721F, -9.6268F, -0.1135F, -0.0011F, 0.0012F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(47, 67).addBox(-0.65F, -0.8891F, -2.3533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F))
				.texOffs(35, 67).addBox(-0.65F, -0.8891F, -2.1533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.395F)), PartPose.offsetAndRotation(0.15F, -0.9264F, -8.3632F, 0.4625F, -0.0011F, 0.0012F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(30, 67).addBox(-0.65F, -0.7554F, -2.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.15F, -0.9264F, -8.3632F, 0.3796F, -0.0011F, 0.0012F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(25, 67).addBox(-0.65F, -0.4168F, -1.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(20, 67).addBox(-0.65F, -0.5668F, -1.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.395F)), PartPose.offsetAndRotation(0.15F, -0.9264F, -8.3632F, 0.2487F, -0.0011F, 0.0012F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 56).addBox(-0.65F, -0.4368F, -1.5983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.15F, -0.9264F, -8.3632F, 0.1789F, -0.0011F, 0.0012F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 58).addBox(-0.6516F, -0.2228F, -2.5781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.15F, -1.1264F, -7.0632F, 0.192F, -0.0012F, 0.0011F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 21).addBox(-0.6516F, -0.3728F, -0.3781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.1515F, -0.9818F, -8.47F, 0.2269F, -0.0012F, 0.0011F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(59, 29).addBox(-0.6377F, -0.3292F, -0.3926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.2187F, 0.0686F, 0.0114F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 33).addBox(-0.6128F, -0.3028F, 0.8284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.2358F, 0.0531F, 0.0035F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(32, 48).addBox(-0.6195F, -0.3759F, 2.0565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.2008F, 0.0522F, 0.0038F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 56).addBox(-0.6377F, -0.3292F, -0.3926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.2195F, 0.1384F, 0.0114F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(56, 17).addBox(-1.0F, -0.3937F, -1.6084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.5F, -1.4014F, -6.5381F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(25, 48).addBox(-0.6195F, -0.3759F, 2.0565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.2011F, 0.122F, 0.0038F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 48).addBox(-1.0F, -0.364F, -1.6484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.9514F, -4.1131F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(14, 56).addBox(-0.6128F, -0.3028F, 0.8284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -1.2014F, -7.7382F, 0.236F, 0.1229F, 0.0035F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5071F, -0.5579F, -1.6334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)), PartPose.offsetAndRotation(0.4704F, -1.4825F, -4.292F, 0.2072F, 0.13F, 0.1264F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(7, 52).addBox(-0.4995F, -0.4831F, -0.8554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)), PartPose.offsetAndRotation(0.4704F, -1.4825F, -4.292F, -0.0985F, 0.1602F, 0.0514F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(7, 56).addBox(-1.0F, -0.4019F, -0.3342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.3764F, -6.5881F, 0.2356F, 0.0011F, -0.0015F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5464F, -1.0305F, -1.5532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.15F, -0.1014F, -8.1132F, 0.1136F, 0.0774F, 0.0068F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(55, 13).addBox(-0.5464F, -0.7366F, -1.6835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.358F)), PartPose.offsetAndRotation(0.15F, -0.1014F, -8.1132F, -0.0696F, 0.0774F, 0.0068F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 9).addBox(-0.6425F, -0.7406F, -0.335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F))
				.texOffs(55, 5).addBox(-0.6425F, -0.6406F, -0.335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, 0.0222F, 0.1089F, 0.0055F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(63, 57).addBox(-0.6828F, -0.3968F, -0.7854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.4509F, -0.6455F, -6.8986F, 1.7619F, 0.0238F, 0.0757F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(69, 6).addBox(-0.6828F, 0.5231F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F)), PartPose.offsetAndRotation(0.4509F, -0.6455F, -6.8986F, 1.2383F, 0.0238F, 0.0757F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(47, 0).addBox(-0.6828F, -0.1989F, -0.4063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.346F))
				.texOffs(38, 43).addBox(-0.6828F, -0.2989F, -0.4063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.4509F, -0.6455F, -6.8986F, 0.4966F, 0.0238F, 0.0757F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(39, 48).addBox(-0.6721F, -0.9355F, 0.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.346F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.1133F, 0.1303F, 0.0028F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 32).addBox(-0.6719F, -0.8476F, 1.1679F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.0788F, 0.1309F, -0.0031F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(49, 54).addBox(-0.6719F, -0.6694F, 0.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.009F, 0.1309F, -0.0031F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(48, 15).addBox(-0.6719F, -1.2229F, 3.3369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2509F, -0.1955F, -8.1736F, -0.1791F, 0.1309F, -0.0031F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(43, 27).addBox(-1.0F, -0.2883F, -0.3062F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -2.5264F, -0.7631F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(42, 53).addBox(-1.2045F, -0.7084F, -0.6079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2045F, -1.3635F, 0.8223F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(63, 17).addBox(-1.2045F, -0.6969F, -0.431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.2045F, -1.3635F, 0.8223F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(63, 0).addBox(-0.975F, 1.025F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 0.0849F, -1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(52, 50).addBox(-1.0F, -1.2F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, -0.5291F, 0.2871F, -0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(52, 46).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(52, 46).addBox(-1.0F, 0.6F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 46).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(52, 46).addBox(-1.0F, -1.0F, 0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -1.3666F, -0.4056F, -0.528F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 52).addBox(-0.5F, -0.6F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.6291F, 0.1884F, -0.8774F, 0.7243F, 0.0008F, -0.0011F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(47, 37).addBox(-1.0F, -0.1594F, -0.1281F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0F, -2.3155F, -2.4965F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(59, 49).addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.4F, -1.8005F, -3.2291F, 0.2234F, 0.0851F, 0.0193F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(59, 25).addBox(-0.5F, -1.225F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -1.1155F, -2.9716F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(32, 27).addBox(-1.0F, -0.875F, -1.35F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -2.6447F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(59, 62).addBox(-1.0F, -0.65F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0327F, -2.9908F, -0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(20, 37).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1506F)), PartPose.offsetAndRotation(0.0F, -0.0799F, -2.6122F, -0.48F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3096F, -1.5862F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(0.2005F, -0.697F, -4.8826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2053F, 0.0827F, 0.0062F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.5511F, -0.5842F, -3.3273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2926F, -0.0827F, -0.0062F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(42, 57).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0728F, 1.042F, -7.5199F, 0.1526F, -0.0265F, -0.0032F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(67, 68).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.359F)).mirror(false), PartPose.offsetAndRotation(-0.0044F, 1.1014F, -8.3079F, -0.2746F, -0.0827F, -0.0062F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5013F, -0.7296F, -4.6402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2053F, -0.0827F, -0.0062F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-0.5013F, -0.6486F, -3.7514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2402F, -0.0827F, -0.0062F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.345F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, 0.5538F, -6.5116F, 0.1617F, -0.0827F, -0.0062F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(29, 43).mirror().addBox(-0.5013F, -0.7016F, -2.8614F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2271F, -0.0827F, -0.0062F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(47, 20).mirror().addBox(-0.2512F, -0.369F, -2.6684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.2267F, -2.5433F, 0.1091F, -0.0611F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-1.0F, -0.6056F, -1.8576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(62, 4).addBox(0.0F, -0.6056F, -1.8576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, -0.0728F, -1.0377F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.5633F, -0.1516F, -1.1061F, -0.1231F, -0.094F, 0.0196F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-0.4F, -0.2238F, -0.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.775F, 0.0522F, 0.0373F, 0.0346F, -0.0957F, 0.0071F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 68).mirror().addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6234F, 0.3001F, -0.5137F, -0.2709F, -0.0957F, 0.0071F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-0.4F, -0.2238F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.344F)).mirror(false), PartPose.offsetAndRotation(-0.775F, 0.0522F, 0.0373F, -0.0527F, -0.0957F, 0.0071F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(12, 64).mirror().addBox(-0.4803F, 0.0258F, 0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(7, 64).mirror().addBox(-0.4803F, -0.1742F, 0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, -2.9449F, -0.0599F, -0.3204F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-0.392F, -0.2415F, 1.1999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(71, 43).mirror().addBox(-0.3842F, -0.44F, 1.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(68, 57).mirror().addBox(-0.392F, -0.3415F, 1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(57, 68).mirror().addBox(-0.3842F, -0.54F, 1.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(68, 54).mirror().addBox(-0.3671F, -0.3415F, 2.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(68, 51).mirror().addBox(-0.3592F, -0.54F, 2.6759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(68, 40).mirror().addBox(-0.3421F, -0.5415F, 3.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(40, 68).mirror().addBox(-0.3342F, -0.74F, 3.3759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, -3.0916F, 0.0087F, -0.3188F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(-0.3628F, -0.7274F, 3.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(68, 20).mirror().addBox(-0.3706F, -0.5289F, 3.9033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, -3.0654F, 0.0087F, -0.3188F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.3508F, 0.237F, -4.1765F, 0.2358F, -0.0607F, -0.0069F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(-0.3F, -0.7467F, -2.6437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3733F, -1.7433F, 0.0349F, -0.0611F, 0.0F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-0.6284F, -0.2877F, 1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 64).mirror().addBox(-0.6284F, -0.2877F, 1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 71).mirror().addBox(-0.6284F, -0.2877F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4571F, -2.1197F, 0.1181F, -0.0541F, 0.0207F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4571F, -2.1197F, -0.1902F, -0.314F, -0.0113F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.6613F, 0.1652F, -0.0954F, 0.4792F, -0.0947F, 0.0154F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(61, 41).mirror().addBox(-0.5F, -0.625F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(35, 60).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.5666F, 0.2033F, -1.098F, -0.088F, -0.0947F, 0.0154F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 3).addBox(-1.2005F, -0.697F, -4.8826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2053F, -0.0827F, -0.0062F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(49, 58).addBox(-0.4489F, -0.5842F, -3.3273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2926F, 0.0827F, 0.0062F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(59, 45).addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(42, 57).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0728F, 1.042F, -7.5199F, 0.1526F, 0.0265F, 0.0032F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 70).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(67, 68).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.359F)), PartPose.offsetAndRotation(0.0044F, 1.1014F, -8.3079F, -0.2746F, 0.0827F, 0.0062F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 57).addBox(-0.4987F, -0.7296F, -4.6402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2053F, 0.0827F, 0.0062F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(56, 54).addBox(-0.4987F, -0.6486F, -3.7514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2402F, 0.0827F, 0.0062F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.345F)), PartPose.offsetAndRotation(0.1567F, 0.5538F, -6.5116F, 0.1617F, 0.0827F, 0.0062F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(29, 43).addBox(-0.4987F, -0.7016F, -2.8614F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2271F, 0.0827F, 0.0062F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(47, 20).addBox(-0.7488F, -0.369F, -2.6684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7F, -0.2267F, -2.5433F, 0.1091F, 0.0611F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.5633F, -0.1516F, -1.1061F, -0.1231F, 0.094F, -0.0196F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(17, 64).addBox(-0.6F, -0.2238F, -0.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.775F, 0.0522F, 0.0373F, 0.0346F, 0.0957F, -0.0071F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 68).addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6234F, 0.3001F, -0.5137F, -0.2709F, 0.0957F, -0.0071F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(32, 64).addBox(-0.6F, -0.2238F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.344F)), PartPose.offsetAndRotation(0.775F, 0.0522F, 0.0373F, -0.0527F, 0.0957F, -0.0071F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(12, 64).addBox(-0.5197F, 0.0258F, 0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(7, 64).addBox(-0.5197F, -0.1742F, 0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, -2.9449F, 0.0599F, 0.3204F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 46).addBox(-0.6079F, -0.2415F, 1.1999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(71, 43).addBox(-0.6158F, -0.44F, 1.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(68, 57).addBox(-0.6079F, -0.3415F, 1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(57, 68).addBox(-0.6158F, -0.54F, 1.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(68, 54).addBox(-0.633F, -0.3415F, 2.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(68, 51).addBox(-0.6408F, -0.54F, 2.6759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(68, 40).addBox(-0.658F, -0.5415F, 3.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(40, 68).addBox(-0.6658F, -0.74F, 3.3759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, -3.0916F, -0.0087F, 0.3188F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(68, 37).addBox(-0.6372F, -0.7274F, 3.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(68, 20).addBox(-0.6294F, -0.5289F, 3.9033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, -3.0654F, -0.0087F, 0.3188F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.3508F, 0.237F, -4.1765F, 0.2358F, 0.0607F, 0.0069F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(9, 47).addBox(-0.7F, -0.7467F, -2.6437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.7F, 0.3733F, -1.7433F, 0.0349F, 0.0611F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(34, 18).addBox(-0.3716F, -0.2877F, 1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(27, 64).addBox(-0.3716F, -0.2877F, 1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 71).addBox(-0.3716F, -0.2877F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4571F, -2.1197F, 0.1181F, 0.0541F, -0.0207F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(42, 61).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4571F, -2.1197F, -0.1902F, 0.314F, 0.0113F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(22, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.6613F, 0.1652F, -0.0954F, 0.4792F, 0.0947F, -0.0154F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(61, 41).addBox(-0.5F, -0.625F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F))
				.texOffs(35, 60).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.5666F, 0.2033F, -1.098F, -0.088F, 0.0947F, -0.0154F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.4588F, 0.0042F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0945F, 8.1607F, -0.0661F, -0.3919F, 0.0253F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, -0.3963F, -0.1041F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.05F, 7.025F, 0.2708F, -0.4346F, -0.0406F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3963F, -0.1041F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.2985F, -0.5637F, -0.0665F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.3963F, -0.1041F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.1604F, -0.3882F, -0.0611F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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