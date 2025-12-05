package fossils.fossils.client.blockentity.model.titanichthys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TitanichthysFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Headslope;
	private final ModelPart Throat;
	private final ModelPart Throatslope;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperjawslope2;
	private final ModelPart Upperjawslope1;
	private final ModelPart Rightcheekslope;
	private final ModelPart Leftcheekslope;
	private final ModelPart Lowerjawback;

	public TitanichthysFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Head = this.root.getChild("Head");
		this.Headslope = this.Head.getChild("Headslope");
		this.Throat = this.Head.getChild("Throat");
		this.Throatslope = this.Throat.getChild("Throatslope");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperjawslope2 = this.Upperjawfront.getChild("Upperjawslope2");
		this.Upperjawslope1 = this.Upperjawback.getChild("Upperjawslope1");
		this.Rightcheekslope = this.Upperjawback.getChild("Rightcheekslope");
		this.Leftcheekslope = this.Upperjawback.getChild("Leftcheekslope");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.6F, 9.0F));

		PartDefinition Head = root.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1758F, -7.9451F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(57, 3).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 57).mirror().addBox(-2.0F, 0.0F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.8126F, 1.2212F, -1.1551F, 0.2017F, 0.1815F, -0.7233F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(46, 17).mirror().addBox(0.2295F, 0.0504F, -1.0077F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2295F, -0.018F, -0.0379F, 0.2737F, 0.1513F, 0.0423F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.5058F, 7.4943F, 1.0133F, 0.4213F, 1.187F, -1.0054F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-1.7036F, 0.0722F, -1.9999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 66).mirror().addBox(-2.4036F, 0.0722F, -1.9999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.351F, 5.0553F, -1.0193F, 0.6721F, 1.3223F, -0.7422F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-1.125F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9657F, 1.014F, 0.1786F, 0.349F, 0.7837F, -0.1992F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(60, 91).mirror().addBox(-0.2F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2121F, 1.5594F, 1.533F, 0.2544F, -0.6715F, -0.9206F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-0.4F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 80).mirror().addBox(-1.1F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2121F, 1.5594F, 1.533F, 0.1997F, -0.1179F, -0.784F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0525F, 3.7694F, 1.627F, 0.1029F, -0.0977F, -1.2011F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-0.9325F, 0.0722F, -1.9176F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.351F, 5.0553F, -1.0193F, 0.4599F, 1.2186F, -0.964F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(-0.9F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.875F, 4.8429F, 1.041F, 0.1025F, 0.0325F, -1.1877F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(66, 3).mirror().addBox(-2.0519F, 0.0036F, -1.5348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7858F, 1.4789F, -2.1036F, 0.1818F, 0.1642F, -0.7268F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-1.0F, -0.5F, -0.725F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2079F, 4.1859F, -2.616F, 0.1052F, -0.2279F, -1.2149F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2872F, 2.5233F, -0.794F, 0.1057F, 0.2495F, -1.1648F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.75F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-1.15F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0326F, -0.0319F, 0.2931F, 0.5765F, -0.2876F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.75F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9657F, 1.014F, 0.1786F, 0.2477F, 0.1555F, -0.4115F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(-1.5519F, 0.0036F, -1.9848F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.7858F, 1.4789F, -2.1036F, 0.1967F, 0.4214F, -0.6755F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(18, 56).mirror().addBox(-2.0269F, 0.0036F, -2.0098F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.9731F, 0.6587F, -2.3081F, 0.2222F, 0.1024F, -0.4249F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4067F, -1.381F, 0.2462F, 0.1132F, -0.4223F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(46, 17).addBox(-2.2295F, 0.0504F, -1.0077F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2295F, -0.018F, -0.0379F, 0.2737F, -0.1513F, -0.0423F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(60, 91).addBox(-0.8F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.2121F, 1.5594F, 1.533F, 0.2544F, 0.6715F, 0.9206F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(80, 6).addBox(-0.6F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 80).addBox(0.1F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.2121F, 1.5594F, 1.533F, 0.1997F, 0.1179F, 0.784F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(38, 57).addBox(0.0F, 0.0F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(57, 3).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8126F, 1.2212F, -1.1551F, 0.2017F, -0.1815F, 0.7233F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(47, 57).addBox(-1.1F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.875F, 4.8429F, 1.041F, 0.1025F, -0.0325F, 1.1877F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(71, 15).addBox(0.7036F, 0.0722F, -1.9999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 66).addBox(1.4036F, 0.0722F, -1.9999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.351F, 5.0553F, -1.0193F, 0.6721F, -1.3223F, 0.7422F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(57, 66).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.5058F, 7.4943F, 1.0133F, 0.4213F, -1.187F, 1.0054F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(44, 48).addBox(-2.0675F, 0.0722F, -1.9176F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.351F, 5.0553F, -1.0193F, 0.4599F, -1.2186F, 0.964F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(40, 20).addBox(-1.0F, -0.5F, -0.725F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2079F, 4.1859F, -2.616F, 0.1052F, 0.2279F, 1.2149F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(68, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0525F, 3.7694F, 1.627F, 0.1029F, 0.0977F, 1.2011F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(15, 37).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.2872F, 2.5233F, -0.794F, 0.1057F, -0.2495F, 1.1648F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(80, 0).addBox(-0.25F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 80).addBox(0.15F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.0326F, -0.0319F, 0.2931F, -0.5765F, 0.2876F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(15, 91).addBox(0.125F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9657F, 1.014F, 0.1786F, 0.349F, -0.7837F, 0.1992F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(76, 79).addBox(-0.25F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9657F, 1.014F, 0.1786F, 0.2477F, -0.1555F, 0.4115F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4067F, -1.381F, 0.2462F, -0.1132F, 0.4223F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(28, 42).addBox(-4.2295F, 0.0504F, -2.4077F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2295F, -0.018F, -0.0379F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(66, 3).addBox(1.0519F, 0.0036F, -1.5348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7858F, 1.4789F, -2.1036F, 0.1818F, -0.1642F, 0.7268F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(57, 7).addBox(-0.4482F, 0.0036F, -1.9848F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.7858F, 1.4789F, -2.1036F, 0.1967F, -0.4214F, 0.6755F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(18, 56).addBox(0.0269F, 0.0036F, -2.0098F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.9731F, 0.6587F, -2.3081F, 0.2222F, -0.1024F, 0.4249F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(42, 13).addBox(-1.8732F, 0.0036F, -2.0098F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1268F, 0.6587F, -2.3081F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5263F, 11.2036F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Headslope_r1 = Headslope.addOrReplaceChild("Headslope_r1", CubeListBuilder.create().texOffs(75, 72).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1915F, 7.1875F, -13.0743F, -0.1766F, -1.0997F, -1.3853F));

		PartDefinition Headslope_r2 = Headslope.addOrReplaceChild("Headslope_r2", CubeListBuilder.create().texOffs(76, 27).addBox(-0.05F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.1915F, 7.1875F, -13.0743F, -0.7044F, -0.9443F, -0.7736F));

		PartDefinition Headslope_r3 = Headslope.addOrReplaceChild("Headslope_r3", CubeListBuilder.create().texOffs(63, 43).addBox(-2.7012F, 0.0571F, 0.2201F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.7645F, 2.8262F, -8.7213F, -0.0468F, -0.6712F, -1.4308F));

		PartDefinition Headslope_r4 = Headslope.addOrReplaceChild("Headslope_r4", CubeListBuilder.create().texOffs(51, 30).addBox(-4.4953F, 0.03F, 0.0363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-7.0557F, 5.1935F, -10.2124F, 0.4057F, -1.063F, -2.0399F));

		PartDefinition Headslope_r5 = Headslope.addOrReplaceChild("Headslope_r5", CubeListBuilder.create().texOffs(53, 22).addBox(-4.4953F, 0.03F, 0.0363F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-7.0557F, 5.1935F, -10.2124F, -0.0039F, -1.1076F, -1.5786F));

		PartDefinition Headslope_r6 = Headslope.addOrReplaceChild("Headslope_r6", CubeListBuilder.create().texOffs(73, 8).addBox(-1.7466F, 0.03F, -0.4272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 88).addBox(-0.7466F, 0.03F, -0.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-7.0557F, 5.1935F, -10.2124F, -0.0027F, -0.8458F, -1.5801F));

		PartDefinition Headslope_r7 = Headslope.addOrReplaceChild("Headslope_r7", CubeListBuilder.create().texOffs(63, 56).addBox(-2.9147F, 0.0558F, -0.4282F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.7645F, 2.8262F, -8.7213F, -0.1134F, -0.5734F, -1.4272F));

		PartDefinition Headslope_r8 = Headslope.addOrReplaceChild("Headslope_r8", CubeListBuilder.create().texOffs(57, 63).addBox(-2.6989F, 0.0571F, -1.189F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.7645F, 2.8262F, -8.7213F, -0.0373F, -0.1916F, -1.4528F));

		PartDefinition Headslope_r9 = Headslope.addOrReplaceChild("Headslope_r9", CubeListBuilder.create().texOffs(48, 0).addBox(-3.7012F, 0.4571F, 0.2201F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.7645F, 2.8262F, -8.7213F, 0.1382F, -0.7133F, -1.7287F));

		PartDefinition Headslope_r10 = Headslope.addOrReplaceChild("Headslope_r10", CubeListBuilder.create().texOffs(73, 63).addBox(0.15F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.287F, 2.7477F, -9.8914F, -0.1059F, -0.0082F, -1.2839F));

		PartDefinition Headslope_r11 = Headslope.addOrReplaceChild("Headslope_r11", CubeListBuilder.create().texOffs(88, 41).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(62, 88).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9952F, 2.8423F, -7.007F, -0.1978F, -1.0029F, -1.1174F));

		PartDefinition Headslope_r12 = Headslope.addOrReplaceChild("Headslope_r12", CubeListBuilder.create().texOffs(67, 88).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.2654F, 3.4938F, -7.7159F, -0.1504F, -0.7879F, -1.1777F));

		PartDefinition Headslope_r13 = Headslope.addOrReplaceChild("Headslope_r13", CubeListBuilder.create().texOffs(60, 34).addBox(-2.0F, 0.0F, 1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.1712F, 0.5737F, -9.8871F, -0.1113F, -0.3118F, -1.2505F));

		PartDefinition Headslope_r14 = Headslope.addOrReplaceChild("Headslope_r14", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2661F, 2.5195F, -0.3492F, 0.3129F, -0.1116F));

		PartDefinition Headslope_r15 = Headslope.addOrReplaceChild("Headslope_r15", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 1.2661F, 2.5195F, -0.3492F, -0.3129F, 0.1116F));

		PartDefinition Headslope_r16 = Headslope.addOrReplaceChild("Headslope_r16", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(-0.7F, -0.3691F, 9.5378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 52).addBox(-0.3F, -0.3691F, 9.5378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 3).addBox(-1.0F, -0.0691F, 6.9377F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 17).addBox(-2.0F, -0.0691F, 0.9377F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Headslope_r17 = Headslope.addOrReplaceChild("Headslope_r17", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7138F, 2.1917F, 5.2758F, -1.1521F, 0.8993F, -1.527F));

		PartDefinition Headslope_r18 = Headslope.addOrReplaceChild("Headslope_r18", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4323F, 2.0338F, 4.5985F, -0.6982F, 0.486F, -0.8467F));

		PartDefinition Headslope_r19 = Headslope.addOrReplaceChild("Headslope_r19", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(0.0F, -0.0691F, -0.0873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.4F, -3.9F, -0.4133F, -0.4924F, 0.1858F));

		PartDefinition Headslope_r20 = Headslope.addOrReplaceChild("Headslope_r20", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.123F, 1.9275F, 3.8833F, -0.6284F, 0.486F, -0.8467F));

		PartDefinition Headslope_r21 = Headslope.addOrReplaceChild("Headslope_r21", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-0.2233F, -0.172F, 0.8547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.081F, 1.8802F, 2.2709F, -0.5062F, 0.486F, -0.8467F));

		PartDefinition Headslope_r22 = Headslope.addOrReplaceChild("Headslope_r22", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-1.4F, 0.0309F, -0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 86).mirror().addBox(-1.0F, 0.0309F, -0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9342F, 0.776F, 2.7538F, -0.4318F, -0.068F, -0.3454F));

		PartDefinition Headslope_r23 = Headslope.addOrReplaceChild("Headslope_r23", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.0715F, -0.172F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.081F, 1.8802F, 2.2709F, -0.4706F, 0.3318F, -0.7575F));

		PartDefinition Headslope_r24 = Headslope.addOrReplaceChild("Headslope_r24", CubeListBuilder.create().texOffs(63, 59).mirror().addBox(-1.0F, 0.0309F, -0.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9342F, 0.776F, 2.7538F, -0.4388F, 0.1855F, -0.4631F));

		PartDefinition Headslope_r25 = Headslope.addOrReplaceChild("Headslope_r25", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-1.0F, -0.45F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 14).mirror().addBox(-1.0F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2052F, -0.6848F, -4.7276F, -0.3617F, 0.5985F, -0.7282F));

		PartDefinition Headslope_r26 = Headslope.addOrReplaceChild("Headslope_r26", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(-1.0F, -0.5F, 0.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3036F, -1.4311F, -9.2181F, -0.2513F, 0.0265F, -0.7612F));

		PartDefinition Headslope_r27 = Headslope.addOrReplaceChild("Headslope_r27", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(-2.0F, 0.0309F, -5.0622F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(49, 68).mirror().addBox(-1.0F, 0.0309F, 3.9378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-2.0F, 0.0309F, -1.0622F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.86F, -0.7937F, -4.0893F, -0.257F, -0.2101F, -0.6997F));

		PartDefinition Headslope_r28 = Headslope.addOrReplaceChild("Headslope_r28", CubeListBuilder.create().texOffs(78, 11).mirror().addBox(-0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8214F, 1.9841F, 1.7638F, -0.2522F, 0.0857F, -0.7765F));

		PartDefinition Headslope_r29 = Headslope.addOrReplaceChild("Headslope_r29", CubeListBuilder.create().texOffs(53, 17).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2989F, 1.765F, -0.7894F, -0.2756F, 0.2292F, -0.8144F));

		PartDefinition Headslope_r30 = Headslope.addOrReplaceChild("Headslope_r30", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0435F, 3.292F, -5.2773F, -0.1519F, 0.4359F, -1.2487F));

		PartDefinition Headslope_r31 = Headslope.addOrReplaceChild("Headslope_r31", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.9315F, 3.3804F, -4.2875F, -0.1377F, -0.0392F, -1.1788F));

		PartDefinition Headslope_r32 = Headslope.addOrReplaceChild("Headslope_r32", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.575F, -0.425F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8508F, 1.7673F, -1.4521F, -0.3768F, -1.0692F, -0.6926F));

		PartDefinition Headslope_r33 = Headslope.addOrReplaceChild("Headslope_r33", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-1.0F, 0.0309F, 1.9378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 25).mirror().addBox(-2.0F, 0.0309F, -5.0623F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.3564F, 0.466F, -4.5064F, -0.144F, -0.2985F, -1.1416F));

		PartDefinition Headslope_r34 = Headslope.addOrReplaceChild("Headslope_r34", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-1.1F, 0.0309F, -1.0622F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1332F, 2.8529F, -3.2027F, -0.3142F, -1.1108F, -0.9009F));

		PartDefinition Headslope_r35 = Headslope.addOrReplaceChild("Headslope_r35", CubeListBuilder.create().texOffs(21, 20).mirror().addBox(-2.0F, 0.0309F, -0.0622F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.4946F, -3.8674F, -0.3119F, -0.1112F, -0.3604F));

		PartDefinition Headslope_r36 = Headslope.addOrReplaceChild("Headslope_r36", CubeListBuilder.create().texOffs(71, 85).addBox(-0.425F, -0.425F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8508F, 1.7673F, -1.4521F, -0.3768F, 1.0692F, 0.6926F));

		PartDefinition Headslope_r37 = Headslope.addOrReplaceChild("Headslope_r37", CubeListBuilder.create().texOffs(33, 72).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0435F, 3.292F, -5.2773F, -0.1519F, -0.4359F, 1.2487F));

		PartDefinition Headslope_r38 = Headslope.addOrReplaceChild("Headslope_r38", CubeListBuilder.create().texOffs(85, 72).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.9315F, 3.3804F, -4.2875F, -0.1377F, 0.0392F, 1.1788F));

		PartDefinition Headslope_r39 = Headslope.addOrReplaceChild("Headslope_r39", CubeListBuilder.create().texOffs(59, 0).addBox(-1.9F, 0.0309F, -1.0622F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1332F, 2.8529F, -3.2027F, -0.3142F, 1.1108F, 0.9009F));

		PartDefinition Headslope_r40 = Headslope.addOrReplaceChild("Headslope_r40", CubeListBuilder.create().texOffs(85, 69).addBox(0.0F, 0.0309F, 1.9378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 25).addBox(0.0F, 0.0309F, -5.0623F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.3564F, 0.466F, -4.5064F, -0.144F, 0.2985F, 1.1416F));

		PartDefinition Headslope_r41 = Headslope.addOrReplaceChild("Headslope_r41", CubeListBuilder.create().texOffs(81, 85).addBox(-1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(76, 85).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9952F, 2.8423F, -7.007F, -0.1978F, 1.0029F, 1.1174F));

		PartDefinition Headslope_r42 = Headslope.addOrReplaceChild("Headslope_r42", CubeListBuilder.create().texOffs(85, 75).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.2654F, 3.4938F, -7.7159F, -0.1504F, 0.7879F, 1.1777F));

		PartDefinition Headslope_r43 = Headslope.addOrReplaceChild("Headslope_r43", CubeListBuilder.create().texOffs(72, 42).addBox(-2.15F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.287F, 2.7477F, -9.8914F, -0.1059F, 0.0082F, 1.2839F));

		PartDefinition Headslope_r44 = Headslope.addOrReplaceChild("Headslope_r44", CubeListBuilder.create().texOffs(62, 17).addBox(-0.0853F, 0.0558F, -0.4282F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.7645F, 2.8262F, -8.7213F, -0.1134F, 0.5734F, 1.4272F));

		PartDefinition Headslope_r45 = Headslope.addOrReplaceChild("Headslope_r45", CubeListBuilder.create().texOffs(41, 61).addBox(-0.3011F, 0.0571F, -1.189F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.7645F, 2.8262F, -8.7213F, -0.0373F, 0.1916F, 1.4528F));

		PartDefinition Headslope_r46 = Headslope.addOrReplaceChild("Headslope_r46", CubeListBuilder.create().texOffs(49, 72).addBox(-0.2534F, 0.03F, -0.4272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 82).addBox(-0.2534F, 0.03F, -0.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.0557F, 5.1935F, -10.2124F, -0.0027F, 0.8458F, 1.5801F));

		PartDefinition Headslope_r47 = Headslope.addOrReplaceChild("Headslope_r47", CubeListBuilder.create().texOffs(17, 75).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1915F, 7.1875F, -13.0743F, -0.1766F, 1.0997F, 1.3853F));

		PartDefinition Headslope_r48 = Headslope.addOrReplaceChild("Headslope_r48", CubeListBuilder.create().texOffs(61, 74).addBox(-0.95F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.1915F, 7.1875F, -13.0743F, -0.7044F, 0.9443F, 0.7736F));

		PartDefinition Headslope_r49 = Headslope.addOrReplaceChild("Headslope_r49", CubeListBuilder.create().texOffs(51, 26).addBox(0.4953F, 0.03F, 0.0363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.0557F, 5.1935F, -10.2124F, 0.4057F, 1.063F, 2.0399F));

		PartDefinition Headslope_r50 = Headslope.addOrReplaceChild("Headslope_r50", CubeListBuilder.create().texOffs(52, 44).addBox(0.4953F, 0.03F, 0.0363F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(7.0557F, 5.1935F, -10.2124F, -0.0039F, 1.1076F, 1.5786F));

		PartDefinition Headslope_r51 = Headslope.addOrReplaceChild("Headslope_r51", CubeListBuilder.create().texOffs(62, 25).addBox(-0.2988F, 0.0571F, 0.2201F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.7645F, 2.8262F, -8.7213F, -0.0468F, 0.6712F, 1.4308F));

		PartDefinition Headslope_r52 = Headslope.addOrReplaceChild("Headslope_r52", CubeListBuilder.create().texOffs(40, 26).addBox(-0.2988F, 0.4571F, 0.2201F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.7645F, 2.8262F, -8.7213F, 0.1382F, 0.7133F, 1.7287F));

		PartDefinition Headslope_r53 = Headslope.addOrReplaceChild("Headslope_r53", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 0.0F, 1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.1712F, 0.5737F, -9.8871F, -0.1113F, 0.3118F, 1.2505F));

		PartDefinition Headslope_r54 = Headslope.addOrReplaceChild("Headslope_r54", CubeListBuilder.create().texOffs(53, 17).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2989F, 1.765F, -0.7894F, -0.2756F, -0.2292F, 0.8144F));

		PartDefinition Headslope_r55 = Headslope.addOrReplaceChild("Headslope_r55", CubeListBuilder.create().texOffs(86, 46).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7138F, 2.1917F, 5.2758F, -1.1521F, -0.8993F, 1.527F));

		PartDefinition Headslope_r56 = Headslope.addOrReplaceChild("Headslope_r56", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4323F, 2.0338F, 4.5985F, -0.6982F, -0.486F, 0.8467F));

		PartDefinition Headslope_r57 = Headslope.addOrReplaceChild("Headslope_r57", CubeListBuilder.create().texOffs(86, 27).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.123F, 1.9275F, 3.8833F, -0.6284F, -0.486F, 0.8467F));

		PartDefinition Headslope_r58 = Headslope.addOrReplaceChild("Headslope_r58", CubeListBuilder.create().texOffs(86, 24).addBox(-0.7767F, -0.172F, 0.8547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.081F, 1.8802F, 2.2709F, -0.5062F, -0.486F, 0.8467F));

		PartDefinition Headslope_r59 = Headslope.addOrReplaceChild("Headslope_r59", CubeListBuilder.create().texOffs(35, 91).addBox(-0.9285F, -0.172F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.081F, 1.8802F, 2.2709F, -0.4706F, -0.3318F, 0.7575F));

		PartDefinition Headslope_r60 = Headslope.addOrReplaceChild("Headslope_r60", CubeListBuilder.create().texOffs(78, 11).addBox(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8214F, 1.9841F, 1.7638F, -0.2522F, -0.0857F, 0.7765F));

		PartDefinition Headslope_r61 = Headslope.addOrReplaceChild("Headslope_r61", CubeListBuilder.create().texOffs(49, 68).addBox(0.0F, 0.0309F, 3.9378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(41, 42).addBox(1.0F, 0.0309F, -5.0622F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(36, 29).addBox(0.0F, 0.0309F, -1.0622F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.86F, -0.7937F, -4.0893F, -0.257F, 0.2101F, 0.6997F));

		PartDefinition Headslope_r62 = Headslope.addOrReplaceChild("Headslope_r62", CubeListBuilder.create().texOffs(13, 43).addBox(0.0F, -0.5F, 0.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3036F, -1.4311F, -9.2181F, -0.2513F, -0.0265F, 0.7612F));

		PartDefinition Headslope_r63 = Headslope.addOrReplaceChild("Headslope_r63", CubeListBuilder.create().texOffs(78, 17).addBox(0.0F, -0.45F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(78, 14).addBox(0.0F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2052F, -0.6848F, -4.7276F, -0.3617F, -0.5985F, 0.7282F));

		PartDefinition Headslope_r64 = Headslope.addOrReplaceChild("Headslope_r64", CubeListBuilder.create().texOffs(5, 86).addBox(0.4F, 0.0309F, -0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 86).addBox(0.0F, 0.0309F, -0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9342F, 0.776F, 2.7538F, -0.4318F, 0.068F, 0.3454F));

		PartDefinition Headslope_r65 = Headslope.addOrReplaceChild("Headslope_r65", CubeListBuilder.create().texOffs(63, 59).addBox(0.0F, 0.0309F, -0.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9342F, 0.776F, 2.7538F, -0.4388F, -0.1855F, 0.4631F));

		PartDefinition Headslope_r66 = Headslope.addOrReplaceChild("Headslope_r66", CubeListBuilder.create().texOffs(21, 20).addBox(0.0F, 0.0309F, -0.0622F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -1.4946F, -3.8674F, -0.3119F, 0.1112F, 0.3604F));

		PartDefinition Headslope_r67 = Headslope.addOrReplaceChild("Headslope_r67", CubeListBuilder.create().texOffs(72, 54).addBox(-2.0F, -0.0691F, -0.0873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -1.4F, -3.9F, -0.4133F, 0.4924F, -0.1858F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 7.5F, 1.7F));

		PartDefinition Throatslope = Throat.addOrReplaceChild("Throatslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3381F, 1.9628F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Throatslope_r1 = Throatslope.addOrReplaceChild("Throatslope_r1", CubeListBuilder.create().texOffs(27, 0).addBox(-5.3663F, -0.8406F, 1.1132F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, 0.7808F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Throatslope_r2 = Throatslope.addOrReplaceChild("Throatslope_r2", CubeListBuilder.create().texOffs(23, 6).addBox(-5.3663F, -0.7487F, 2.0998F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, 0.7808F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Throatslope_r3 = Throatslope.addOrReplaceChild("Throatslope_r3", CubeListBuilder.create().texOffs(36, 36).addBox(-2.3663F, -1.0089F, 0.0074F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8663F, -0.3194F, 10.8323F, 0.1876F, 0.0F, 0.0F));

		PartDefinition Throatslope_r4 = Throatslope.addOrReplaceChild("Throatslope_r4", CubeListBuilder.create().texOffs(0, 6).addBox(-3.3663F, -1.0089F, 0.5075F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, 4.3808F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Throatslope_r5 = Throatslope.addOrReplaceChild("Throatslope_r5", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(0.3F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -0.0689F, -4.6738F, -0.081F, -0.4317F, 0.6029F));

		PartDefinition Throatslope_r6 = Throatslope.addOrReplaceChild("Throatslope_r6", CubeListBuilder.create().texOffs(36, 78).mirror().addBox(0.1F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -0.0689F, -4.6738F, -0.0737F, 0.0468F, 0.5655F));

		PartDefinition Throatslope_r7 = Throatslope.addOrReplaceChild("Throatslope_r7", CubeListBuilder.create().texOffs(27, 13).mirror().addBox(-2.7409F, -0.5F, -0.9751F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8663F, -0.319F, -4.9835F, -0.2284F, 0.298F, -0.0681F));

		PartDefinition Throatslope_r8 = Throatslope.addOrReplaceChild("Throatslope_r8", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-2.8591F, -1.0F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8663F, 0.4727F, -3.9192F, -0.1034F, 0.5648F, -0.0555F));

		PartDefinition Throatslope_r9 = Throatslope.addOrReplaceChild("Throatslope_r9", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-2.6593F, -0.9197F, 0.8489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8663F, 0.4727F, -3.9192F, -0.0205F, 0.2608F, -0.0233F));

		PartDefinition Throatslope_r10 = Throatslope.addOrReplaceChild("Throatslope_r10", CubeListBuilder.create().texOffs(19, 29).mirror().addBox(-1.6788F, -1.0089F, 0.2364F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8663F, 0.4727F, 4.3808F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition Throatslope_r11 = Throatslope.addOrReplaceChild("Throatslope_r11", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(0.0212F, -0.0089F, -0.0636F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4638F, -1.2999F, 10.6122F, 0.2118F, 0.3029F, 0.0844F));

		PartDefinition Throatslope_r12 = Throatslope.addOrReplaceChild("Throatslope_r12", CubeListBuilder.create().texOffs(55, 78).mirror().addBox(-2.0664F, -0.9758F, 1.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, -1.0273F, 14.4808F, 0.4081F, 0.7426F, 0.2844F));

		PartDefinition Throatslope_r13 = Throatslope.addOrReplaceChild("Throatslope_r13", CubeListBuilder.create().texOffs(55, 47).mirror().addBox(-1.3999F, -0.9758F, 0.1956F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, -1.0273F, 14.4808F, 0.3253F, 0.4161F, 0.1355F));

		PartDefinition Throatslope_r14 = Throatslope.addOrReplaceChild("Throatslope_r14", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0212F, -0.0089F, -0.0636F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4638F, -1.2999F, 10.6122F, 0.2118F, -0.3029F, -0.0844F));

		PartDefinition Throatslope_r15 = Throatslope.addOrReplaceChild("Throatslope_r15", CubeListBuilder.create().texOffs(19, 29).addBox(-0.3212F, -1.0089F, 0.2364F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8663F, 0.4727F, 4.3808F, 0.124F, -0.1732F, -0.0215F));

		PartDefinition Throatslope_r16 = Throatslope.addOrReplaceChild("Throatslope_r16", CubeListBuilder.create().texOffs(55, 47).addBox(-0.6001F, -0.9758F, 0.1956F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8663F, -1.0273F, 14.4808F, 0.3253F, -0.4161F, -0.1355F));

		PartDefinition Throatslope_r17 = Throatslope.addOrReplaceChild("Throatslope_r17", CubeListBuilder.create().texOffs(55, 78).addBox(1.0664F, -0.9758F, 1.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, -1.0273F, 14.4808F, 0.4081F, -0.7426F, -0.2844F));

		PartDefinition Throatslope_r18 = Throatslope.addOrReplaceChild("Throatslope_r18", CubeListBuilder.create().texOffs(52, 39).addBox(-1.3663F, -0.9758F, 0.2887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8663F, -1.0273F, 14.4808F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Throatslope_r19 = Throatslope.addOrReplaceChild("Throatslope_r19", CubeListBuilder.create().texOffs(27, 13).addBox(-2.2591F, -0.5F, -0.9751F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.8663F, -0.319F, -4.9835F, -0.2284F, -0.298F, 0.0681F));

		PartDefinition Throatslope_r20 = Throatslope.addOrReplaceChild("Throatslope_r20", CubeListBuilder.create().texOffs(55, 13).addBox(-1.8663F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(0, 14).addBox(-6.8663F, -0.5F, 0.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, -0.319F, -4.9835F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Throatslope_r21 = Throatslope.addOrReplaceChild("Throatslope_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-5.3663F, -0.8275F, 1.7917F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, -3.9192F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Throatslope_r22 = Throatslope.addOrReplaceChild("Throatslope_r22", CubeListBuilder.create().texOffs(51, 34).addBox(1.6593F, -0.9197F, 0.8489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8663F, 0.4727F, -3.9192F, -0.0205F, -0.2608F, 0.0233F));

		PartDefinition Throatslope_r23 = Throatslope.addOrReplaceChild("Throatslope_r23", CubeListBuilder.create().texOffs(64, 20).addBox(1.8591F, -1.0F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8663F, 0.4727F, -3.9192F, -0.1034F, -0.5648F, 0.0555F));

		PartDefinition Throatslope_r24 = Throatslope.addOrReplaceChild("Throatslope_r24", CubeListBuilder.create().texOffs(23, 10).addBox(-5.8663F, -1.0F, 0.8F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, -3.9192F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Throatslope_r25 = Throatslope.addOrReplaceChild("Throatslope_r25", CubeListBuilder.create().texOffs(78, 45).addBox(-1.3F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -0.0689F, -4.6738F, -0.081F, 0.4317F, -0.6029F));

		PartDefinition Throatslope_r26 = Throatslope.addOrReplaceChild("Throatslope_r26", CubeListBuilder.create().texOffs(36, 78).addBox(-1.1F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.0F, -0.0689F, -4.6738F, -0.0737F, -0.0468F, -0.5655F));

		PartDefinition Throatslope_r27 = Throatslope.addOrReplaceChild("Throatslope_r27", CubeListBuilder.create().texOffs(21, 17).addBox(-6.3663F, -1.0F, 0.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.3856F, -4.1154F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, -4.3F));

		PartDefinition Upperjawback_r1 = Upperjawback.addOrReplaceChild("Upperjawback_r1", CubeListBuilder.create().texOffs(90, 69).addBox(-0.2898F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 23).addBox(-0.7398F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 47).addBox(-0.5148F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8382F, 4.3381F, -3.3743F, 0.0572F, -0.3815F, 0.2405F));

		PartDefinition Upperjawback_r2 = Upperjawback.addOrReplaceChild("Upperjawback_r2", CubeListBuilder.create().texOffs(41, 79).addBox(-0.7102F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 60).addBox(-0.2602F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 81).addBox(-0.4852F, -0.572F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8382F, 4.3381F, -3.3743F, 0.0572F, 0.3815F, -0.2405F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(72, 88).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.6713F, 1.6625F, -5.1909F, -0.3732F, -0.1461F, -1.388F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(77, 88).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.1034F, 1.4607F, -4.977F, -0.4586F, 0.111F, -0.8334F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(82, 88).addBox(-0.6894F, -0.7817F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4463F, 1.8403F, -5.2436F, -0.3277F, 0.111F, -0.8334F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(87, 88).addBox(-0.4955F, -0.6907F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4416F, 2.2703F, -5.4177F, -0.0768F, 0.3037F, -0.046F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5507F, -0.7683F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(5, 89).addBox(-0.5507F, -0.3683F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4416F, 2.2703F, -5.4177F, -0.2387F, 0.2044F, -0.6697F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(89, 38).addBox(-0.3006F, -0.2842F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(89, 52).addBox(-0.3006F, -0.6842F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4416F, 2.2703F, -5.4177F, -0.0658F, 0.3062F, -0.0095F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(55, 89).addBox(-0.3459F, -0.661F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.4463F, 1.8403F, -5.2436F, -0.1419F, 0.3159F, -0.0086F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(5, 74).addBox(-1.335F, -1.15F, -0.5917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.4463F, 1.8403F, -5.2436F, -0.3688F, 0.3159F, -0.0086F));

		PartDefinition Upperjawfront_r9 = Upperjawfront.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(76, 31).addBox(-0.5115F, -0.7903F, -0.3689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(90, 0).addBox(-0.5115F, 0.2097F, -0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.4235F, 1.4588F, -3.768F, 1.2957F, -0.7031F, 0.1616F));

		PartDefinition Upperjawfront_r10 = Upperjawfront.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(90, 6).addBox(-0.5115F, -0.2047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(10, 90).addBox(-0.5115F, -1.3047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(20, 90).addBox(-0.5115F, -0.7047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.4235F, 1.4588F, -3.768F, 1.575F, -0.7031F, 0.1616F));

		PartDefinition Upperjawfront_r11 = Upperjawfront.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(30, 90).addBox(-0.5115F, -0.9762F, -0.8075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.4235F, 1.4588F, -3.768F, 0.7023F, -0.7031F, 0.1616F));

		PartDefinition Upperjawfront_r12 = Upperjawfront.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(90, 72).addBox(-0.5115F, -0.2532F, -0.518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.4235F, 1.4588F, -3.768F, -0.6242F, -0.7031F, 0.1616F));

		PartDefinition Upperjawfront_r13 = Upperjawfront.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5115F, -0.1747F, 0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(90, 75).addBox(-0.5115F, -0.1747F, -0.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4235F, 1.4588F, -3.768F, -0.0744F, -0.7031F, 0.1616F));

		PartDefinition Upperjawfront_r14 = Upperjawfront.addOrReplaceChild("Upperjawfront_r14", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5045F, -0.6907F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4416F, 2.2703F, -5.4177F, -0.0768F, -0.3037F, 0.046F));

		PartDefinition Upperjawfront_r15 = Upperjawfront.addOrReplaceChild("Upperjawfront_r15", CubeListBuilder.create().texOffs(80, 82).addBox(-0.4493F, -0.7683F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(75, 82).addBox(-0.4493F, -0.3683F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4416F, 2.2703F, -5.4177F, -0.2387F, -0.2044F, 0.6697F));

		PartDefinition Upperjawfront_r16 = Upperjawfront.addOrReplaceChild("Upperjawfront_r16", CubeListBuilder.create().texOffs(70, 82).addBox(-0.6994F, -0.2842F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(82, 60).addBox(-0.6994F, -0.6842F, -0.4972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4416F, 2.2703F, -5.4177F, -0.0658F, -0.3062F, 0.0095F));

		PartDefinition Upperjawfront_r17 = Upperjawfront.addOrReplaceChild("Upperjawfront_r17", CubeListBuilder.create().texOffs(83, 9).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.6713F, 1.6625F, -5.1909F, -0.3732F, 0.1461F, 1.388F));

		PartDefinition Upperjawfront_r18 = Upperjawfront.addOrReplaceChild("Upperjawfront_r18", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.1034F, 1.4607F, -4.977F, -0.4586F, -0.111F, 0.8334F));

		PartDefinition Upperjawfront_r19 = Upperjawfront.addOrReplaceChild("Upperjawfront_r19", CubeListBuilder.create().texOffs(83, 3).addBox(-0.3106F, -0.7817F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4463F, 1.8403F, -5.2436F, -0.3277F, -0.111F, 0.8334F));

		PartDefinition Upperjawfront_r20 = Upperjawfront.addOrReplaceChild("Upperjawfront_r20", CubeListBuilder.create().texOffs(82, 57).addBox(-0.6541F, -0.661F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.4463F, 1.8403F, -5.2436F, -0.1419F, -0.3159F, 0.0086F));

		PartDefinition Upperjawfront_r21 = Upperjawfront.addOrReplaceChild("Upperjawfront_r21", CubeListBuilder.create().texOffs(63, 71).addBox(-0.665F, -1.15F, -0.5917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.4463F, 1.8403F, -5.2436F, -0.3688F, -0.3159F, 0.0086F));

		PartDefinition Upperjawfront_r22 = Upperjawfront.addOrReplaceChild("Upperjawfront_r22", CubeListBuilder.create().texOffs(81, 79).addBox(-0.4885F, -1.3047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(15, 82).addBox(-0.4885F, -0.2047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(81, 66).addBox(-0.4885F, -0.7047F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.4235F, 1.4588F, -3.768F, 1.575F, 0.7031F, -0.1616F));

		PartDefinition Upperjawfront_r23 = Upperjawfront.addOrReplaceChild("Upperjawfront_r23", CubeListBuilder.create().texOffs(12, 74).addBox(-0.4885F, -0.7903F, -0.3689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(42, 82).addBox(-0.4885F, 0.2097F, -0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.4235F, 1.4588F, -3.768F, 1.2957F, 0.7031F, -0.1616F));

		PartDefinition Upperjawfront_r24 = Upperjawfront.addOrReplaceChild("Upperjawfront_r24", CubeListBuilder.create().texOffs(56, 81).addBox(-0.4885F, -0.9762F, -0.8075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.4235F, 1.4588F, -3.768F, 0.7023F, 0.7031F, -0.1616F));

		PartDefinition Upperjawfront_r25 = Upperjawfront.addOrReplaceChild("Upperjawfront_r25", CubeListBuilder.create().texOffs(27, 79).addBox(-0.4885F, -0.2532F, -0.518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.4235F, 1.4588F, -3.768F, -0.6242F, 0.7031F, -0.1616F));

		PartDefinition Upperjawfront_r26 = Upperjawfront.addOrReplaceChild("Upperjawfront_r26", CubeListBuilder.create().texOffs(38, 54).addBox(-0.4885F, -0.1747F, 0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(15, 79).addBox(-0.4885F, -0.1747F, -0.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4235F, 1.4588F, -3.768F, -0.0744F, 0.7031F, -0.1616F));

		PartDefinition Upperjawslope2 = Upperjawfront.addOrReplaceChild("Upperjawslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0253F, -1.4544F, 0.7404F, 0.0F, 0.0F));

		PartDefinition Upperjawslope14_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope14_r1", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(0.0F, 0.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4215F, 2.7866F, -3.4037F, -1.7151F, -0.3255F, 0.5649F));

		PartDefinition Upperjawslope13_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope13_r1", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4215F, 2.7866F, -3.4037F, -1.3661F, -0.3255F, 0.5649F));

		PartDefinition Upperjawslope12_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope12_r1", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0945F, 2.3934F, -4.1944F, -1.6838F, -0.342F, 0.6556F));

		PartDefinition Upperjawslope12_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope12_r2", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5647F, 2.8558F, -3.9392F, -1.5267F, -0.342F, 0.6556F));

		PartDefinition Upperjawslope10_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope10_r1", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.2F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 68).mirror().addBox(-0.2F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.1527F, -4.3604F, -2.9065F, -0.5884F, 3.0452F));

		PartDefinition Upperjawslope8_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r1", CubeListBuilder.create().texOffs(37, 82).mirror().addBox(-0.55F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.771F, -0.1404F, -3.9235F, -3.1268F, -0.9078F, 2.9217F));

		PartDefinition Upperjawslope7_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r1", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4964F, -4.4905F, -0.1353F, -0.7808F, 0.0956F));

		PartDefinition Upperjawslope11_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope11_r1", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(0.0F, -0.075F, 0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.1604F, 0.8945F, -2.9717F, -1.963F, -0.342F, 0.6556F));

		PartDefinition Upperjawslope10_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope10_r2", CubeListBuilder.create().texOffs(51, 81).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1604F, 0.8945F, -2.9717F, -0.8722F, -0.342F, 0.6556F));

		PartDefinition Upperjawslope7_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r2", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(0.0F, -0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2454F, -0.2799F, -3.0688F, 0.3663F, 0.182F, 1.1336F));

		PartDefinition Upperjawslope6_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r1", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-0.05F, -0.0581F, -0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3829F, -3.8165F, 0.3053F, 0.0884F, 1.4548F));

		PartDefinition Upperjawslope9_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r1", CubeListBuilder.create().texOffs(32, 81).mirror().addBox(0.0F, 0.5371F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(81, 29).mirror().addBox(0.0F, 0.0121F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 26).mirror().addBox(0.0F, 0.5371F, -0.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 81).mirror().addBox(0.0F, 0.0121F, -0.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3751F, 0.1547F, -2.1671F, -0.2248F, -0.1341F, 0.916F));

		PartDefinition Upperjawslope6_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r2", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(0.0F, 0.0121F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2621F, -1.9211F, -0.2493F, -0.0785F, 1.1463F));

		PartDefinition Upperjawslope5_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r1", CubeListBuilder.create().texOffs(80, 76).mirror().addBox(0.0F, 0.0121F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2621F, -1.9211F, -0.3292F, -0.0745F, 1.1169F));

		PartDefinition Upperjawslope10_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope10_r3", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-2.05F, 0.0F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8896F, 0.4481F, -0.0659F, 0.0288F, -0.5331F, -0.7048F));

		PartDefinition Upperjawslope10_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope10_r4", CubeListBuilder.create().texOffs(80, 73).mirror().addBox(-0.825F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3306F, 1.4849F, -0.8179F, 0.0257F, -0.2714F, -0.6971F));

		PartDefinition Upperjawslope8_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r2", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8896F, 0.4481F, -0.0659F, 0.0249F, -0.0969F, -0.6926F));

		PartDefinition Upperjawslope7_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r3", CubeListBuilder.create().texOffs(64, 67).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0024F, 0.034F, -0.0011F, -0.1F, -0.4645F));

		PartDefinition Upperjawslope6_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r3", CubeListBuilder.create().texOffs(66, 63).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0024F, 0.034F, -0.0012F, -0.2746F, -0.4642F));

		PartDefinition Upperjawslope5_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r2", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(0.0F, 0.0121F, -1.2289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(46, 79).mirror().addBox(0.0F, 0.0121F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2621F, -1.9211F, -0.0875F, -0.3261F, 0.0281F));

		PartDefinition Upperjawslope5_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r3", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(0.0F, -0.0581F, -0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3829F, -3.8165F, -0.125F, -0.6943F, 0.0803F));

		PartDefinition Upperjawslope5_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r4", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0024F, 0.034F, -0.1304F, -0.2424F, 0.0315F));

		PartDefinition Upperjawslope9_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r2", CubeListBuilder.create().texOffs(80, 73).addBox(-0.175F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3306F, 1.4849F, -0.8179F, 0.0257F, 0.2714F, 0.6971F));

		PartDefinition Upperjawslope9_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r3", CubeListBuilder.create().texOffs(56, 70).addBox(1.05F, 0.0F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8896F, 0.4481F, -0.0659F, 0.0288F, 0.5331F, 0.7048F));

		PartDefinition Upperjawslope7_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r4", CubeListBuilder.create().texOffs(71, 19).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8896F, 0.4481F, -0.0659F, 0.0249F, 0.0969F, 0.6926F));

		PartDefinition Upperjawslope6_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r4", CubeListBuilder.create().texOffs(64, 67).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0024F, 0.034F, -0.0011F, 0.1F, 0.4645F));

		PartDefinition Upperjawslope5_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r5", CubeListBuilder.create().texOffs(66, 63).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.0024F, 0.034F, -0.0012F, 0.2746F, 0.4642F));

		PartDefinition Upperjawslope4_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r1", CubeListBuilder.create().texOffs(23, 65).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0024F, 0.034F, -0.1304F, 0.2424F, -0.0315F));

		PartDefinition Upperjawslope3_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r1", CubeListBuilder.create().texOffs(24, 46).addBox(-3.7295F, -0.7156F, -7.1092F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2295F, 1.357F, 5.012F, -0.1265F, 0.0F, 0.0F));

		PartDefinition Upperjawslope9_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r4", CubeListBuilder.create().texOffs(83, 12).addBox(-0.8F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 68).addBox(-0.8F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3631F, 0.1527F, -4.3604F, -2.9065F, 0.5884F, -3.0452F));

		PartDefinition Upperjawslope7_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r5", CubeListBuilder.create().texOffs(37, 82).addBox(-0.45F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.771F, -0.1404F, -3.9235F, -3.1268F, 0.9078F, -2.9217F));

		PartDefinition Upperjawslope6_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r5", CubeListBuilder.create().texOffs(25, 82).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.4964F, -4.4905F, -0.1353F, 0.7808F, -0.0956F));

		PartDefinition Upperjawslope5_r6 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r6", CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, -0.3594F, -0.9883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.2621F, -3.7211F, -0.096F, 0.0F, 0.0F));

		PartDefinition Upperjawslope6_r6 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r6", CubeListBuilder.create().texOffs(81, 48).addBox(-1.0F, -0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2454F, -0.2799F, -3.0688F, 0.3663F, -0.182F, -1.1336F));

		PartDefinition Upperjawslope5_r7 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r7", CubeListBuilder.create().texOffs(81, 32).addBox(-0.95F, -0.0581F, -0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3829F, -3.8165F, 0.3053F, -0.0884F, -1.4548F));

		PartDefinition Upperjawslope4_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r2", CubeListBuilder.create().texOffs(79, 54).addBox(-1.0F, -0.0581F, -0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -0.3829F, -3.8165F, -0.125F, 0.6943F, -0.0803F));

		PartDefinition Upperjawslope3_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r2", CubeListBuilder.create().texOffs(60, 78).addBox(-0.5F, -0.0581F, -1.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2871F, -2.8211F, -0.096F, 0.0F, 0.0F));

		PartDefinition Upperjawslope4_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r3", CubeListBuilder.create().texOffs(71, 79).addBox(-1.0F, 0.0121F, -1.2289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(46, 79).addBox(-1.0F, 0.0121F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.2621F, -1.9211F, -0.0875F, 0.3261F, -0.0281F));

		PartDefinition Upperjawslope7_r6 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r6", CubeListBuilder.create().texOffs(81, 29).addBox(-1.0F, 0.0121F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 81).addBox(-1.0F, 0.5371F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(81, 26).addBox(-1.0F, 0.5371F, -0.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 81).addBox(-1.0F, 0.0121F, -0.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.3751F, 0.1547F, -2.1671F, -0.2248F, 0.1341F, -0.916F));

		PartDefinition Upperjawslope13_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope13_r2", CubeListBuilder.create().texOffs(91, 30).addBox(-1.0F, 0.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.4215F, 2.7866F, -3.4037F, -1.7151F, 0.3255F, -0.5649F));

		PartDefinition Upperjawslope12_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope12_r3", CubeListBuilder.create().texOffs(91, 27).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4215F, 2.7866F, -3.4037F, -1.3661F, 0.3255F, -0.5649F));

		PartDefinition Upperjawslope11_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope11_r2", CubeListBuilder.create().texOffs(78, 3).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5647F, 2.8558F, -3.9392F, -1.5267F, 0.342F, -0.6556F));

		PartDefinition Upperjawslope11_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope11_r3", CubeListBuilder.create().texOffs(83, 15).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0945F, 2.3934F, -4.1944F, -1.6838F, 0.342F, -0.6556F));

		PartDefinition Upperjawslope10_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope10_r5", CubeListBuilder.create().texOffs(81, 51).addBox(-1.0F, -0.075F, 0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.1604F, 0.8945F, -2.9717F, -1.963F, 0.342F, -0.6556F));

		PartDefinition Upperjawslope9_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope9_r5", CubeListBuilder.create().texOffs(51, 81).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1604F, 0.8945F, -2.9717F, -0.8722F, 0.342F, -0.6556F));

		PartDefinition Upperjawslope5_r8 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r8", CubeListBuilder.create().texOffs(10, 81).addBox(-1.0F, 0.0121F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -0.2621F, -1.9211F, -0.2493F, 0.0785F, -1.1463F));

		PartDefinition Upperjawslope4_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r4", CubeListBuilder.create().texOffs(80, 76).addBox(-1.0F, 0.0121F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -0.2621F, -1.9211F, -0.3292F, 0.0745F, -1.1169F));

		PartDefinition Upperjawslope2_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope2_r1", CubeListBuilder.create().texOffs(38, 3).addBox(-1.0F, 0.0121F, -1.0289F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0198F)), PartPose.offsetAndRotation(0.0F, -0.2621F, -1.9211F, -0.0829F, 0.0F, 0.0F));

		PartDefinition Upperjawslope1 = Upperjawback.addOrReplaceChild("Upperjawslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1172F, -0.0005F, 0.4138F, 0.0F, 0.0F));

		PartDefinition Upperjawslope10_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope10_r6", CubeListBuilder.create().texOffs(40, 91).addBox(-0.474F, -0.4952F, -1.0887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.857F, 1.8052F, -3.6181F, 0.2424F, -0.823F, -1.1273F));

		PartDefinition Upperjawslope9_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r6", CubeListBuilder.create().texOffs(90, 33).addBox(-0.4957F, -0.5048F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.857F, 1.8052F, -3.6181F, 0.3109F, -1.0079F, -1.2132F));

		PartDefinition Upperjawslope10_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope10_r7", CubeListBuilder.create().texOffs(7, 70).addBox(1.5398F, 0.0521F, -2.1297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, 0.1473F, -0.4642F, -1.3365F));

		PartDefinition Upperjawslope9_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r7", CubeListBuilder.create().texOffs(46, 8).addBox(0.0077F, 0.0521F, -3.0464F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, 0.1707F, -0.6883F, -1.3792F));

		PartDefinition Upperjawslope11_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope11_r4", CubeListBuilder.create().texOffs(14, 70).addBox(-3.8874F, -0.347F, -2.1863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, 2.7828F, -0.8924F, 2.2427F));

		PartDefinition Upperjawslope10_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope10_r8", CubeListBuilder.create().texOffs(45, 90).addBox(-3.6912F, -0.347F, -2.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.2783F, 5.3253F, -1.0458F, 2.5997F, -1.1293F, 2.4571F));

		PartDefinition Upperjawslope9_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r8", CubeListBuilder.create().texOffs(50, 90).addBox(-2.9348F, -0.347F, -3.8719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2783F, 5.3253F, -1.0458F, 1.9079F, -1.3351F, -3.0997F));

		PartDefinition Upperjawslope8_r3 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r3", CubeListBuilder.create().texOffs(22, 78).addBox(-0.9028F, -1.131F, -5.0623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, 0.6759F, -1.0773F, -1.6165F));

		PartDefinition Upperjawslope8_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r4", CubeListBuilder.create().texOffs(29, 54).addBox(2.2981F, -1.0281F, -3.0118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, -0.0827F, -0.4276F, -0.8381F));

		PartDefinition Upperjawslope7_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r7", CubeListBuilder.create().texOffs(91, 44).addBox(2.0852F, -1.3502F, -4.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3033F, 5.3253F, -0.9458F, 0.0191F, -0.4971F, -0.8316F));

		PartDefinition Upperjawslope6_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r7", CubeListBuilder.create().texOffs(90, 63).addBox(-1.0F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.2681F, -1.9763F, -0.0619F, -0.0322F, -0.479F));

		PartDefinition Upperjawslope6_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r8", CubeListBuilder.create().texOffs(26, 70).addBox(-0.675F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6641F, 0.9099F, 0.004F, -0.2194F, -1.0098F, -0.2969F));

		PartDefinition Upperjawslope5_r9 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r9", CubeListBuilder.create().texOffs(64, 11).addBox(-1.0F, 0.0F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0F, -0.007F, 0.0066F, -0.1163F, -0.0603F, -0.4765F));

		PartDefinition Upperjawslope9_r9 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r9", CubeListBuilder.create().texOffs(30, 66).addBox(-2.5398F, 0.0521F, -2.1297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, 0.1473F, 0.4642F, 1.3365F));

		PartDefinition Upperjawslope8_r5 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r5", CubeListBuilder.create().texOffs(0, 45).addBox(-2.0077F, 0.0521F, -3.0464F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, 0.1707F, 0.6883F, 1.3792F));

		PartDefinition Upperjawslope7_r8 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r8", CubeListBuilder.create().texOffs(44, 52).addBox(-3.2981F, -1.0281F, -3.0118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, -0.0827F, 0.4276F, 0.8381F));

		PartDefinition Upperjawslope10_r9 = Upperjawslope1.addOrReplaceChild("Upperjawslope10_r9", CubeListBuilder.create().texOffs(14, 66).addBox(2.8874F, -0.347F, -2.1863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, 2.7828F, 0.8924F, -2.2427F));

		PartDefinition Upperjawslope9_r10 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r10", CubeListBuilder.create().texOffs(65, 80).addBox(2.6912F, -0.347F, -2.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.2783F, 5.3253F, -1.0458F, 2.5997F, 1.1293F, -2.4571F));

		PartDefinition Upperjawslope8_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r6", CubeListBuilder.create().texOffs(80, 63).addBox(1.9348F, -0.347F, -3.8719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2783F, 5.3253F, -1.0458F, 1.9079F, 1.3351F, 3.0997F));

		PartDefinition Upperjawslope9_r11 = Upperjawslope1.addOrReplaceChild("Upperjawslope9_r11", CubeListBuilder.create().texOffs(25, 91).addBox(-0.526F, -0.4952F, -1.0887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.857F, 1.8052F, -3.6181F, 0.2424F, 0.823F, 1.1273F));

		PartDefinition Upperjawslope8_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope8_r7", CubeListBuilder.create().texOffs(80, 70).addBox(-0.5043F, -0.5048F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.857F, 1.8052F, -3.6181F, 0.3109F, 1.0079F, 1.2132F));

		PartDefinition Upperjawslope7_r9 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r9", CubeListBuilder.create().texOffs(66, 77).addBox(-0.0972F, -1.131F, -5.0623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, 0.6759F, 1.0773F, 1.6165F));

		PartDefinition Upperjawslope6_r9 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r9", CubeListBuilder.create().texOffs(91, 24).addBox(-3.0852F, -1.3502F, -4.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3033F, 5.3253F, -0.9458F, 0.0191F, 0.4971F, 0.8316F));

		PartDefinition Upperjawslope5_r10 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r10", CubeListBuilder.create().texOffs(80, 35).addBox(0.0F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2681F, -1.9763F, -0.0619F, 0.0322F, 0.479F));

		PartDefinition Upperjawslope4_r5 = Upperjawslope1.addOrReplaceChild("Upperjawslope4_r5", CubeListBuilder.create().texOffs(27, 3).addBox(-2.0F, 0.0F, -0.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2681F, -1.9763F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawslope5_r11 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r11", CubeListBuilder.create().texOffs(66, 7).addBox(-0.325F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6641F, 0.9099F, 0.004F, -0.2194F, 1.0098F, 0.2969F));

		PartDefinition Upperjawslope4_r6 = Upperjawslope1.addOrReplaceChild("Upperjawslope4_r6", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, 0.0F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, -0.007F, 0.0066F, -0.1163F, 0.0603F, 0.4765F));

		PartDefinition Upperjawslope3_r3 = Upperjawslope1.addOrReplaceChild("Upperjawslope3_r3", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, 0.0F, -1.95F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.007F, 0.0066F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightcheekslope = Upperjawback.addOrReplaceChild("Rightcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2359F, 6.5049F, -4.1736F, 0.6914F, 0.1588F, -0.0003F));

		PartDefinition Rightcheekslope_r1 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r1", CubeListBuilder.create().texOffs(35, 48).addBox(-0.9939F, -1.9924F, -2.9227F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2043F, -0.1879F, 2.5062F, 1.5055F, 0.0451F, -0.2067F));

		PartDefinition Rightcheekslope_r2 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r2", CubeListBuilder.create().texOffs(64, 46).addBox(-0.5875F, -1.0471F, -1.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5299F, 0.4908F, 3.3229F, 0.8705F, -0.0239F, -0.1542F));

		PartDefinition Rightcheekslope_r3 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r3", CubeListBuilder.create().texOffs(34, 61).addBox(-0.9864F, 0.4699F, -2.7306F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2043F, -0.1879F, 2.5062F, -0.5445F, 0.0371F, -0.2052F));

		PartDefinition Rightcheekslope_r4 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r4", CubeListBuilder.create().texOffs(68, 38).addBox(-0.9864F, 0.2973F, -3.6699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2043F, -0.1879F, 2.5062F, 0.11F, 0.0371F, -0.2052F));

		PartDefinition Rightcheekslope_r5 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r5", CubeListBuilder.create().texOffs(71, 23).addBox(-0.9864F, -0.0361F, -3.8923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2043F, -0.1879F, 2.5062F, 0.459F, 0.0371F, -0.2052F));

		PartDefinition Rightcheekslope_r6 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r6", CubeListBuilder.create().texOffs(61, 83).addBox(-0.5F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0805F, 3.2896F, 0.008F, -0.9877F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r7 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r7", CubeListBuilder.create().texOffs(83, 43).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(83, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0325F, 3.8896F, 1.3819F, -1.9825F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r8 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r8", CubeListBuilder.create().texOffs(83, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0743F, 3.827F, 2.3791F, -1.5026F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r9 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r9", CubeListBuilder.create().texOffs(28, 37).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3451F, 2.3436F, 3.6929F, -0.7172F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r10 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r10", CubeListBuilder.create().texOffs(37, 68).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4996F, 1.3604F, 3.7903F, -0.0976F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r11 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r11", CubeListBuilder.create().texOffs(79, 40).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5071F, 1.1693F, 3.1095F, 0.5133F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r12 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r12", CubeListBuilder.create().texOffs(20, 84).addBox(-0.5038F, -2.2356F, -0.3299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, -1.927F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r13 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r13", CubeListBuilder.create().texOffs(52, 84).addBox(-0.5038F, -0.056F, 1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, 3.1345F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r14 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r14", CubeListBuilder.create().texOffs(47, 84).addBox(-0.5038F, -1.7794F, 0.42F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, 2.2618F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r15 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r15", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5038F, -1.633F, -0.822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, 1.5637F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r16 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r16", CubeListBuilder.create().texOffs(30, 84).addBox(-0.5038F, 0.0713F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, -0.4871F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r17 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r17", CubeListBuilder.create().texOffs(26, 74).addBox(-0.5038F, -1.7491F, 0.1578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, -1.4034F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r18 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r18", CubeListBuilder.create().texOffs(11, 49).addBox(-0.5038F, -1.0961F, -2.2342F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, -0.7489F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r19 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r19", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5038F, -1.5637F, 0.562F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, 0.6038F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r20 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r20", CubeListBuilder.create().texOffs(10, 84).addBox(-0.5038F, -2.1316F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, 0.0802F, -0.0667F, -0.0831F));

		PartDefinition Rightcheekslope_r21 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r21", CubeListBuilder.create().texOffs(29, 50).addBox(-0.5038F, -1.9049F, -1.9999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.215F, 5.0268F, 4.6714F, -0.5307F, -0.0667F, -0.0831F));

		PartDefinition Leftcheekslope = Upperjawback.addOrReplaceChild("Leftcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2359F, 6.5049F, -4.1736F, 0.6914F, -0.1588F, 0.0003F));

		PartDefinition Leftcheekslope_r1 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r1", CubeListBuilder.create().texOffs(20, 50).addBox(-0.0061F, -1.9924F, -2.9227F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2043F, -0.1879F, 2.5062F, 1.5055F, -0.0451F, 0.2067F));

		PartDefinition Leftcheekslope_r2 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r2", CubeListBuilder.create().texOffs(69, 50).addBox(-0.4125F, -1.0471F, -1.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5299F, 0.4908F, 3.3229F, 0.8705F, 0.0239F, 0.1542F));

		PartDefinition Leftcheekslope_r3 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r3", CubeListBuilder.create().texOffs(50, 63).addBox(-0.0136F, 0.4699F, -2.7306F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2043F, -0.1879F, 2.5062F, -0.5445F, -0.0371F, 0.2052F));

		PartDefinition Leftcheekslope_r4 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r4", CubeListBuilder.create().texOffs(69, 32).addBox(-0.0136F, 0.2973F, -3.6699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2043F, -0.1879F, 2.5062F, 0.11F, -0.0371F, 0.2052F));

		PartDefinition Leftcheekslope_r5 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r5", CubeListBuilder.create().texOffs(71, 46).addBox(-0.0136F, -0.0361F, -3.8923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2043F, -0.1879F, 2.5062F, 0.459F, -0.0371F, 0.2052F));

		PartDefinition Leftcheekslope_r6 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r6", CubeListBuilder.create().texOffs(35, 88).addBox(-0.5F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0805F, 3.2896F, 0.008F, -0.9877F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r7 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r7", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(88, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0325F, 3.8896F, 1.3819F, -1.9825F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r8 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r8", CubeListBuilder.create().texOffs(88, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0743F, 3.827F, 2.3791F, -1.5026F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r9 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r9", CubeListBuilder.create().texOffs(62, 51).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3451F, 2.3436F, 3.6929F, -0.7172F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r10 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r10", CubeListBuilder.create().texOffs(69, 28).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4996F, 1.3604F, 3.7903F, -0.0976F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r11 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r11", CubeListBuilder.create().texOffs(88, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5071F, 1.1693F, 3.1095F, 0.5133F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r12 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r12", CubeListBuilder.create().texOffs(15, 88).addBox(-0.4962F, -2.2356F, -0.3299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, -1.927F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r13 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r13", CubeListBuilder.create().texOffs(88, 12).addBox(-0.4962F, -0.056F, 1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, 3.1345F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r14 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r14", CubeListBuilder.create().texOffs(88, 9).addBox(-0.4962F, -1.7794F, 0.42F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, 2.2618F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r15 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r15", CubeListBuilder.create().texOffs(88, 3).addBox(-0.4962F, -1.633F, -0.822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, 1.5637F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r16 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r16", CubeListBuilder.create().texOffs(87, 60).addBox(-0.4962F, 0.0713F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, -0.4871F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r17 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r17", CubeListBuilder.create().texOffs(50, 75).addBox(-0.4962F, -1.7491F, 0.1578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, -1.4034F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r18 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r18", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4962F, -1.0961F, -2.2342F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, -0.7489F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r19 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r19", CubeListBuilder.create().texOffs(21, 69).addBox(-0.4962F, -1.5637F, 0.562F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, 0.6038F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r20 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r20", CubeListBuilder.create().texOffs(87, 57).addBox(-0.4962F, -2.1316F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, 0.0802F, 0.0667F, 0.0831F));

		PartDefinition Leftcheekslope_r21 = Leftcheekslope.addOrReplaceChild("Leftcheekslope_r21", CubeListBuilder.create().texOffs(45, 75).addBox(-0.4962F, -1.9049F, -1.9999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.215F, 5.0268F, 4.6714F, -0.5307F, 0.0667F, 0.0831F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6347F, 9.4635F, -3.6228F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Lowerjawback.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 60).addBox(0.0F, -4.5382F, -0.7846F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-8.1695F, 1.2F, 0.4F, 1.5621F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = Lowerjawback.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 49).addBox(0.0F, -2.8107F, 0.256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-8.1695F, 1.2F, 0.4F, 1.2217F, -0.2182F, 0.0F));

		PartDefinition cube_r3 = Lowerjawback.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 75).addBox(0.0F, -4.1731F, 1.2022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1695F, 1.2F, 0.4F, 1.597F, -0.2182F, 0.0F));

		PartDefinition cube_r4 = Lowerjawback.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 72).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8381F, -0.892F, -3.5424F, 1.6362F, -0.3927F, 0.0F));

		PartDefinition cube_r5 = Lowerjawback.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 76).addBox(-0.6826F, -2.7793F, 0.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.3659F, -0.9683F, 0.1855F));

		PartDefinition cube_r6 = Lowerjawback.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 86).addBox(-0.6826F, -2.7179F, 1.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.715F, -0.9683F, 0.1855F));

		PartDefinition cube_r7 = Lowerjawback.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 20).addBox(-0.9218F, -1.6282F, 2.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.397F, -1.0948F, 0.048F));

		PartDefinition cube_r8 = Lowerjawback.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 66).addBox(-0.6826F, -1.24F, 2.2648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.2386F, -0.9683F, 0.1855F));

		PartDefinition cube_r9 = Lowerjawback.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 78).addBox(-0.6826F, -1.6184F, 1.8528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.8023F, -0.9683F, 0.1855F));

		PartDefinition cube_r10 = Lowerjawback.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 85).addBox(-0.6826F, -1.5068F, 2.2801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.811F, -0.9683F, 0.1855F));

		PartDefinition cube_r11 = Lowerjawback.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 87).addBox(-0.6826F, -0.7994F, 2.5458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.2124F, -0.9683F, 0.1855F));

		PartDefinition cube_r12 = Lowerjawback.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(70, 91).addBox(-0.9218F, -4.0589F, 0.507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 91).addBox(-0.9218F, -3.5589F, 0.507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.6901F, -1.0948F, 0.048F));

		PartDefinition cube_r13 = Lowerjawback.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 57).addBox(-0.9218F, -2.1002F, 2.8067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.4493F, -1.0948F, 0.048F));

		PartDefinition cube_r14 = Lowerjawback.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 87).addBox(-0.9218F, -2.1381F, 2.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.2661F, -1.0948F, 0.048F));

		PartDefinition cube_r15 = Lowerjawback.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 87).addBox(-0.6826F, -1.7458F, 2.4648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 2.1077F, -0.9683F, 0.1855F));

		PartDefinition cube_r16 = Lowerjawback.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 3).addBox(0.038F, -2.1871F, 1.6842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.467F, -0.6167F, 0.0946F));

		PartDefinition cube_r17 = Lowerjawback.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 36).addBox(-0.012F, -1.7425F, 1.4185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.4845F, -0.6167F, 0.0946F));

		PartDefinition cube_r18 = Lowerjawback.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 28).addBox(-0.012F, -2.0846F, 0.0173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-6.2154F, 1.5982F, -6.4946F, 1.2838F, -0.6167F, 0.0946F));

		PartDefinition cube_r19 = Lowerjawback.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(16, 60).addBox(0.0737F, -2.9502F, -0.7453F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-7.2695F, 1.2F, -4.0F, 1.4312F, -0.3927F, 0.0F));

		PartDefinition cube_r20 = Lowerjawback.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 87).addBox(0.0F, -0.8038F, -1.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(50, 87).addBox(0.0F, -0.8038F, -1.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1695F, 1.2F, 0.4F, 0.3491F, -0.2182F, 0.0F));

		PartDefinition cube_r21 = Lowerjawback.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(76, 66).addBox(0.0F, -0.7904F, -2.111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 11).addBox(0.0F, -0.7904F, -1.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-8.1695F, 1.2F, 0.4F, -0.5847F, -0.2182F, 0.0F));

		PartDefinition cube_r22 = Lowerjawback.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(27, 59).addBox(-1.0F, -4.5382F, -0.7846F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9F, 1.2F, 0.4F, 1.5621F, 0.2182F, 0.0F));

		PartDefinition cube_r23 = Lowerjawback.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(85, 6).addBox(-1.0F, -2.8107F, 0.256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9F, 1.2F, 0.4F, 1.2217F, 0.2182F, 0.0F));

		PartDefinition cube_r24 = Lowerjawback.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 74).addBox(-1.0F, -4.1731F, 1.2022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.2F, 0.4F, 1.597F, 0.2182F, 0.0F));

		PartDefinition cube_r25 = Lowerjawback.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(71, 67).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5686F, -0.892F, -3.5424F, 1.6362F, 0.3927F, 0.0F));

		PartDefinition cube_r26 = Lowerjawback.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 0).addBox(-0.3174F, -2.7793F, 0.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.3659F, 0.9683F, -0.1855F));

		PartDefinition cube_r27 = Lowerjawback.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(85, 63).addBox(-0.3174F, -2.7179F, 1.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.715F, 0.9683F, -0.1855F));

		PartDefinition cube_r28 = Lowerjawback.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 78).addBox(-0.0783F, -1.6282F, 2.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.397F, 1.0948F, -0.048F));

		PartDefinition cube_r29 = Lowerjawback.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 85).addBox(-0.3174F, -1.24F, 2.2648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.2386F, 0.9683F, -0.1855F));

		PartDefinition cube_r30 = Lowerjawback.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 85).addBox(-0.3174F, -1.6184F, 1.8528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.8023F, 0.9683F, -0.1855F));

		PartDefinition cube_r31 = Lowerjawback.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 35).addBox(-0.3174F, -1.5068F, 2.2801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.811F, 0.9683F, -0.1855F));

		PartDefinition cube_r32 = Lowerjawback.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 85).addBox(-0.3174F, -0.7994F, 2.5458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.2124F, 0.9683F, -0.1855F));

		PartDefinition cube_r33 = Lowerjawback.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 66).addBox(-0.0783F, -4.0589F, 0.507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 91).addBox(-0.0783F, -3.5589F, 0.507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.6901F, 1.0948F, -0.048F));

		PartDefinition cube_r34 = Lowerjawback.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 77).addBox(-0.0783F, -2.1002F, 2.8067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.4493F, 1.0948F, -0.048F));

		PartDefinition cube_r35 = Lowerjawback.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 85).addBox(-0.0783F, -2.1381F, 2.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.2661F, 1.0948F, -0.048F));

		PartDefinition cube_r36 = Lowerjawback.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 85).addBox(-0.3174F, -1.7458F, 2.4648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 2.1077F, 0.9683F, -0.1855F));

		PartDefinition cube_r37 = Lowerjawback.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 72).addBox(-1.038F, -2.1871F, 1.6842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.467F, 0.6167F, -0.0946F));

		PartDefinition cube_r38 = Lowerjawback.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 74).addBox(-0.988F, -1.7425F, 1.4185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.4845F, 0.6167F, -0.0946F));

		PartDefinition cube_r39 = Lowerjawback.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(61, 38).addBox(-0.988F, -2.0846F, 0.0173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9459F, 1.5982F, -6.4946F, 1.2838F, 0.6167F, -0.0946F));

		PartDefinition cube_r40 = Lowerjawback.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(56, 57).addBox(-1.0737F, -2.9502F, -0.7453F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 1.2F, -4.0F, 1.4312F, 0.3927F, 0.0F));

		PartDefinition cube_r41 = Lowerjawback.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(85, 0).addBox(-1.0F, -0.8038F, -1.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(84, 54).addBox(-1.0F, -0.8038F, -1.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.2F, 0.4F, 0.3491F, 0.2182F, 0.0F));

		PartDefinition cube_r42 = Lowerjawback.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 50).addBox(-1.0F, -0.7904F, -2.111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 59).addBox(-1.0F, -0.7904F, -1.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9F, 1.2F, 0.4F, -0.5847F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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