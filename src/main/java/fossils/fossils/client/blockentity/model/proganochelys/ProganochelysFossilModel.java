package fossils.fossils.client.blockentity.model.proganochelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProganochelysFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Proganochelys;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart chest;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftCarapace;
	private final ModelPart rightCarapace;

	public ProganochelysFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Proganochelys = this.fossil.getChild("Proganochelys");
		this.frontleftleg4 = this.Proganochelys.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Proganochelys.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.chest = this.Proganochelys.getChild("chest");
		this.frontleftleg = this.chest.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.chest.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.Proganochelys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftCarapace = this.Proganochelys.getChild("leftCarapace");
		this.rightCarapace = this.Proganochelys.getChild("rightCarapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Proganochelys = fossil.addOrReplaceChild("Proganochelys", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.5F, -3.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offset(0.5F, -3.5F, 0.0F));

		PartDefinition cube_r1 = Proganochelys.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 27).addBox(-2.0F, -6.5F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6939F, 7.0F, 6.7391F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r2 = Proganochelys.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.5F, -2.8F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Proganochelys.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 39).addBox(-2.0F, -0.05F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.3792F, -5.7642F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Proganochelys.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 19).addBox(-2.0F, -0.05F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.5537F, -0.7673F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Proganochelys.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 51).addBox(-0.5F, 0.0309F, 0.0015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.3294F, 3.0661F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Proganochelys.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 47).addBox(-0.5F, -0.575F, -0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -5.6116F, 5.1014F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Proganochelys.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.9044F, -3.3339F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Proganochelys.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 59).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.9044F, -3.3339F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Proganochelys.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.7544F, 2.2661F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Proganochelys.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.7544F, 2.2661F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Proganochelys.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 0.2F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.4766F, 3.2473F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Proganochelys.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -0.8F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.5F, 9.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Proganochelys.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.7432F, 6.2069F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Proganochelys.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 44).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.3689F, 2.2562F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Proganochelys.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -1.5F, -13.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.65F, 8.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Proganochelys.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5269F, -1.5351F, 6.5961F, -0.3285F, 0.3301F, -0.4727F));

		PartDefinition cube_r16 = frontleftleg4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(75, 43).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(62, 55).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(71, 4).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r17 = frontleftleg4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(100, 98).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 83).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r18 = frontleftleg4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 86).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r19 = frontleftleg4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 76).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.894F, 3.2572F, -0.554F, 0.1024F, -0.6275F, 0.2639F));

		PartDefinition cube_r20 = frontleftleg5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 36).addBox(-1.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 5).addBox(-2.05F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.5679F, 0.1414F, 0.5239F, 0.1211F));

		PartDefinition cube_r21 = frontleftleg6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 52).addBox(1.2743F, -1.4713F, -1.7024F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg4 = Proganochelys.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5269F, -1.5351F, 6.5961F, 0.5713F, -0.0292F, 0.2545F));

		PartDefinition cube_r22 = frontrightleg4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(62, 55).mirror().addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 4).mirror().addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r23 = frontrightleg4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 98).mirror().addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 83).mirror().addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r24 = frontrightleg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r25 = frontrightleg4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.894F, 3.2572F, -0.554F, 0.3206F, 0.6275F, -0.2639F));

		PartDefinition cube_r26 = frontrightleg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-1.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 5).mirror().addBox(-0.95F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.5679F, -0.8078F, -0.5374F, 0.0299F));

		PartDefinition cube_r27 = frontrightleg6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-2.2743F, -1.4713F, -1.7024F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition chest = Proganochelys.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -5.1016F, -4.5428F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 61).addBox(0.0F, -0.9F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 64).addBox(0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.4595F, -0.6553F, -0.3691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6772F, 3.6333F, -1.8692F, 1.2028F, 0.0051F, 0.1522F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.9941F, -3.1794F, 0.2373F, 0.0944F, -0.322F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(100, 78).mirror().addBox(-3.0418F, -2.5888F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3941F, -1.2794F, -0.0201F, 0.2543F, -1.3568F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3941F, -1.2794F, 0.1319F, 0.219F, -0.7289F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3941F, -1.2794F, 0.2373F, 0.0944F, -0.0776F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.5F, -0.2F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7895F, 4.6494F, -1.3579F, 1.5108F, 0.0185F, 0.37F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-0.9902F, -0.7726F, -1.4615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, 3.5607F, -4.22F, 1.329F, -0.0385F, -0.6329F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-0.4595F, 0.0923F, -1.2466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5844F, 3.041F, -1.5077F, -0.5114F, -0.1898F, -0.1805F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(0.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0103F, 2.611F, -2.0101F, 0.371F, 0.026F, 0.3935F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(-0.5783F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, 3.5607F, -4.22F, -0.2297F, 0.056F, -0.2516F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 60).addBox(-0.4217F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6736F, 3.5607F, -4.22F, -0.2297F, -0.056F, 0.2516F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 77).addBox(-0.0098F, -0.7726F, -1.4615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6736F, 3.5607F, -4.22F, 1.329F, 0.0385F, 0.6329F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(76, 32).addBox(-1.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0103F, 2.611F, -2.0101F, 0.371F, -0.026F, -0.3935F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5405F, -0.6553F, -0.3691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6772F, 3.6333F, -1.8692F, 1.2028F, -0.0051F, -0.1522F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 17).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7895F, 4.6494F, -1.3579F, 1.5108F, -0.0185F, -0.37F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(79, 55).addBox(-0.5405F, 0.0923F, -1.2466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5844F, 3.041F, -1.5077F, -0.5114F, 0.1898F, 0.1805F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 101).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.9941F, -3.1794F, 0.2373F, -0.0944F, 0.322F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 59).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.2373F, -0.0944F, 0.0776F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(100, 78).addBox(2.0418F, -2.5888F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, -0.0201F, -0.2543F, 1.3568F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(25, 9).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.1319F, -0.219F, 0.7289F));

		PartDefinition frontleftleg = chest.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0269F, 3.5665F, -1.8612F, 0.3624F, -0.2483F, -0.5008F));

		PartDefinition cube_r49 = frontleftleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 0).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(63, 58).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(39, 64).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r50 = frontleftleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(100, 95).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 24).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r51 = frontleftleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 86).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r52 = frontleftleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 55).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9853F, 3.2963F, -0.5424F, 0.555F, -0.551F, 0.3102F));

		PartDefinition cube_r53 = frontleftleg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 49).addBox(-1.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 61).addBox(-2.05F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.568F, -0.5253F, 0.5455F, 0.011F));

		PartDefinition cube_r54 = frontleftleg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 52).addBox(1.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg = chest.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0269F, 3.5665F, -1.8612F, -0.4334F, -0.4535F, 0.2916F));

		PartDefinition cube_r55 = frontrightleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(63, 58).mirror().addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(39, 64).mirror().addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r56 = frontrightleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(100, 95).mirror().addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 24).mirror().addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r57 = frontrightleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r58 = frontrightleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9853F, 3.2963F, -0.5424F, -0.2741F, 0.551F, -0.3102F));

		PartDefinition cube_r59 = frontrightleg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-1.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 61).mirror().addBox(-0.95F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.568F, 0.5218F, -0.5455F, -0.011F));

		PartDefinition cube_r60 = frontrightleg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4509F, -3.506F, -0.0549F, -0.305F, 0.0165F));

		PartDefinition cube_r61 = neck.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(18, 56).addBox(-0.5F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 47).addBox(-1.0F, 0.3F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.45F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r62 = neck.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.2247F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.2247F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.252F, 0.0759F, -0.0911F));

		PartDefinition cube_r63 = neck.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.2247F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(35, 86).mirror().addBox(-0.2247F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.0338F, 0.0759F, -0.0911F));

		PartDefinition cube_r64 = neck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 89).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.2555F, 0.0848F, -0.6498F));

		PartDefinition cube_r65 = neck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(89, 53).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.0373F, 0.0848F, -0.6498F));

		PartDefinition cube_r66 = neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.2639F, 0.0908F, -1.2526F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.0458F, 0.0908F, -1.2526F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4274F, -1.401F, 0.258F, 0.1293F, -0.4544F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(71, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4274F, -1.401F, 0.258F, -0.1293F, 0.4544F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(35, 89).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.0458F, -0.0908F, 1.2526F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 36).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.2639F, -0.0908F, 1.2526F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 89).addBox(-0.7753F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 87).addBox(-0.7753F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.252F, -0.0759F, 0.0911F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(45, 89).addBox(-0.7753F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(35, 86).addBox(-0.7753F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.0338F, -0.0759F, 0.0911F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(50, 89).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(89, 56).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.2555F, -0.0848F, 0.6498F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(89, 53).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 89).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.0373F, -0.0848F, 0.6498F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.51F, -1.7503F, 0.2815F, -0.1258F, -0.0363F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(11, 46).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 40).addBox(-1.0F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r77 = neck2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-0.2247F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(5, 89).mirror().addBox(-0.2247F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.4435F, 0.0571F, -0.1038F));

		PartDefinition cube_r78 = neck2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.2247F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(86, 30).mirror().addBox(-0.2247F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.2253F, 0.0571F, -0.1038F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(84, 59).mirror().addBox(-0.5F, -0.2917F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.843F, -1.9794F, -0.2694F, 0.0743F, -0.0924F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(84, 56).mirror().addBox(-0.5F, -0.3032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.843F, -1.9794F, -0.0512F, 0.0743F, -0.0924F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.2247F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 77).mirror().addBox(-0.2247F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.1731F, 0.0625F, -0.1007F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.2247F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(61, 85).mirror().addBox(-0.2247F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.3913F, 0.0625F, -0.1007F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(89, 33).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 89).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.4081F, -0.0319F, -0.6538F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(20, 89).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.1899F, -0.0319F, -0.6538F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.3239F, -0.0916F, -1.2526F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.1058F, -0.0916F, -1.2526F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 86).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.3665F, 0.0F, -0.6545F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(15, 86).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.1484F, 0.0F, -0.6545F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(84, 74).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.3075F, -0.0418F, -1.2536F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.0894F, -0.0418F, -1.2536F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 68).mirror().addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -1.218F, -1.9544F, -0.0512F, 0.0743F, -1.253F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -1.218F, -1.9544F, -0.2694F, 0.0743F, -1.253F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.6F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1488F, -1.5236F, -0.0898F, -0.0539F, -0.5386F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(75, 83).mirror().addBox(-0.5F, -0.2917F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.643F, -1.9794F, -0.2694F, 0.0743F, -0.6509F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 83).mirror().addBox(-0.5F, -0.3032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.643F, -1.9794F, -0.0512F, 0.0743F, -0.6509F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(60, 88).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.1058F, 0.0916F, 1.2526F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(88, 80).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.3239F, 0.0916F, 1.2526F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(5, 89).addBox(-0.7753F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 86).addBox(-0.7753F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.4435F, -0.0571F, 0.1038F));

		PartDefinition cube_r99 = neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(10, 89).addBox(-0.7753F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(86, 30).addBox(-0.7753F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.2253F, -0.0571F, 0.1038F));

		PartDefinition cube_r100 = neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(15, 89).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(89, 33).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.4081F, 0.0319F, 0.6538F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(20, 89).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 89).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.1899F, 0.0319F, 0.6538F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(84, 71).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.0894F, 0.0418F, 1.2536F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 74).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.3075F, 0.0418F, 1.2536F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 85).addBox(-0.7753F, -0.4415F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 86).addBox(-0.7753F, -0.8165F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.3913F, -0.0625F, 0.1007F));

		PartDefinition cube_r105 = neck2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(85, 77).addBox(-0.7753F, -0.4609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(85, 83).addBox(-0.7753F, -0.8609F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.1731F, -0.0625F, 0.1007F));

		PartDefinition cube_r106 = neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(10, 86).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(25, 86).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.3665F, 0.0F, 0.6545F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 86).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 86).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.1484F, 0.0F, 0.6545F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 62).addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.05F, -1.218F, -1.9544F, -0.2694F, -0.0743F, 1.253F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 68).addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, -1.218F, -1.9544F, -0.0512F, -0.0743F, 1.253F));

		PartDefinition cube_r110 = neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(84, 59).addBox(-0.5F, -0.2917F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, -1.843F, -1.9794F, -0.2694F, -0.0743F, 0.0924F));

		PartDefinition cube_r111 = neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(84, 53).addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 56).addBox(-0.5F, -0.3032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.4F, -1.843F, -1.9794F, -0.0512F, -0.0743F, 0.0924F));

		PartDefinition cube_r112 = neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -0.2917F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 84).addBox(-0.5F, -0.6667F, -0.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -1.643F, -1.9794F, -0.2694F, -0.0743F, 0.6509F));

		PartDefinition cube_r113 = neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 83).addBox(-0.5F, -0.3032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(83, 80).addBox(-0.5F, -0.7032F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.643F, -1.9794F, -0.0512F, -0.0743F, 0.6509F));

		PartDefinition cube_r114 = neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 44).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, -0.1488F, -1.5236F, -0.0898F, 0.0539F, 0.5386F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 15).addBox(-2.0F, 0.233F, -2.0095F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(42, 52).addBox(-2.0F, -1.1665F, -2.1409F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -0.5727F, -2.2565F, -0.1392F, -0.346F, 0.0475F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(9, 61).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0385F, -2.9521F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8477F, -3.9338F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 60).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8477F, -3.9338F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 86).addBox(-1.0F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, 1.0524F, -5.5684F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 86).addBox(-1.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.8786F, -5.197F, 2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(87, 44).addBox(-0.5F, -0.3F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4732F, -4.73F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 56).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.174F, -2.1146F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(31, 52).addBox(-2.0F, -1.35F, 0.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.733F, -2.5095F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(40, 79).addBox(-0.85F, 0.3037F, 0.3769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offset(1.85F, -1.4702F, -1.5178F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 65).addBox(-1.025F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3125F, 0.9398F, -2.6206F, 1.99F, 0.5819F, 0.0801F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(98, 9).addBox(1.0F, -0.15F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.85F, 1.4141F, 1.5919F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(36, 83).addBox(1.0F, -1.275F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.85F, 1.4141F, 1.5919F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(98, 6).addBox(1.0F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-1.85F, 1.4141F, 1.5919F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 98).addBox(1.0F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.85F, 1.4141F, 1.5919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(98, 3).addBox(1.15F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.85F, 2.8586F, 0.9681F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(98, 0).addBox(1.0F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.85F, 2.1787F, 0.7079F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(71, 8).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.15F, 2.808F, -0.7486F, 1.5708F, 0.1745F, 0.0F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 32).addBox(-0.9171F, -0.0355F, -0.6628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4123F, 2.1075F, -2.5304F, 1.5265F, 0.3487F, 0.0118F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(87, 47).addBox(-0.6F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(87, 41).addBox(-0.6F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.35F, 2.2431F, -3.2253F, 1.5365F, 0.6627F, 0.0273F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(76, 86).addBox(-0.7F, -0.4F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.5F, 2.2731F, -4.021F, 2.8972F, 0.4634F, -0.111F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(71, 86).addBox(-0.85F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, 2.2731F, -4.021F, 2.8708F, 0.628F, -0.1617F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 86).addBox(-0.7F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.5F, 1.9314F, -3.9452F, 2.1118F, 0.4634F, -0.111F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 80).addBox(-0.6F, -1.475F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3345F, 1.7665F, -3.4166F, -1.2173F, 0.3412F, 0.0172F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 77).addBox(-0.1255F, 0.468F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, -0.8112F, 0.6658F, 0.0606F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 77).addBox(-1.2311F, -0.1263F, -0.998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, -0.8836F, 0.5478F, -0.0659F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(77, 72).addBox(-1.2311F, -0.7324F, -0.7788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, -0.0982F, 0.5478F, -0.0659F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(29, 76).addBox(-0.3586F, -1.1238F, -0.9713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, -0.5631F, 0.0589F, 0.5561F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(29, 76).addBox(-0.3586F, -1.1996F, -0.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(29, 76).addBox(-0.3586F, -1.1996F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 0.6761F, 0.0589F, 0.5561F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(29, 76).addBox(-0.9328F, -1.1707F, -1.019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 1.0419F, -0.4007F, 0.8445F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(29, 76).addBox(-0.6684F, -1.2644F, -0.5959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 1.0006F, -0.1687F, 0.6822F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(29, 76).addBox(-0.3385F, -1.0792F, -0.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 0.2091F, 0.2036F, 0.6547F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(28, 76).addBox(-1.2097F, -0.869F, -0.3203F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 0.426F, 0.4183F, -0.18F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(21, 76).addBox(-1.2689F, -0.4997F, -0.0563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 0.8271F, 0.4888F, -0.2256F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(61, 77).addBox(-1.2896F, -1.1407F, 0.512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.321F, 1.1635F, -2.0725F, -0.2456F, -0.0574F, -0.2633F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(77, 69).addBox(-1.5467F, -0.7916F, 0.2812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.321F, 1.1635F, -2.0725F, 0.1937F, 0.1825F, -0.2167F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 59).addBox(-1.9F, -0.1122F, -0.824F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0346F, 0.163F, -0.7196F, 0.6054F, 0.1877F, -0.1434F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(54, 77).addBox(-1.9F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.2094F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(99, 66).addBox(-0.9F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.2094F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(99, 72).addBox(-0.9F, 0.2775F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7243F, 0.0F, -0.2094F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(60, 100).addBox(-0.9F, 0.3397F, 0.1286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, 0.0F, -0.2094F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 87).addBox(-0.9F, 0.5689F, -0.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8116F, 0.0F, -0.2094F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 77).addBox(-0.2858F, -0.6871F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 80).addBox(-0.4358F, -0.6871F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3593F, 1.3297F, -1.8468F, 1.985F, 0.4966F, 0.0692F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(55, 80).addBox(-0.1873F, -0.9319F, -0.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.696F, 1.1635F, -1.9725F, 2.3426F, 0.5782F, -0.0184F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(31, 81).addBox(-0.4667F, -0.5642F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3593F, 1.3297F, -1.8468F, 1.7189F, 0.2946F, 0.0071F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(75, 98).addBox(-0.5F, -0.5713F, -0.4829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.271F, 1.1792F, -1.5977F, 0.9017F, 0.1377F, 0.0097F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 3).addBox(-0.5F, -0.4389F, -0.5405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.271F, 1.1792F, -1.5977F, 1.2507F, 0.1377F, 0.0097F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5166F, -0.5411F, -0.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3593F, 1.3297F, -1.8468F, 2.1291F, 0.2946F, 0.0071F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(82, 44).addBox(-0.4858F, -0.7492F, -0.836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3593F, 1.3297F, -1.8468F, 1.4713F, 0.3994F, 0.0391F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(100, 92).addBox(-0.1474F, -0.2748F, 0.5413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(100, 89).addBox(-0.1474F, -0.2748F, -0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.0F, -0.0701F, 0.3016F, -0.0969F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.15F, 0.3037F, 0.3769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offset(-1.85F, -1.4702F, -1.5178F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(82, 65).mirror().addBox(0.025F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.3125F, 0.9398F, -2.6206F, 1.99F, -0.5819F, -0.0801F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-2.0F, -0.15F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.85F, 1.4141F, 1.5919F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(-2.0F, -1.275F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.85F, 1.4141F, 1.5919F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-2.0F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(1.85F, 1.4141F, 1.5919F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-2.0F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.85F, 1.4141F, 1.5919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(-2.15F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.85F, 2.8586F, 0.9681F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-2.0F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.85F, 2.1787F, 0.7079F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.808F, -0.7486F, 1.5708F, -0.1745F, 0.0F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-0.0829F, -0.0355F, -0.6628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4123F, 2.1075F, -2.5304F, 1.5265F, -0.3487F, -0.0118F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-0.4F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 41).mirror().addBox(-0.4F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.35F, 2.2431F, -3.2253F, 1.5365F, -0.6627F, -0.0273F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(76, 86).mirror().addBox(-0.3F, -0.4F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.5F, 2.2731F, -4.021F, 2.8972F, -0.4634F, 0.111F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(71, 86).mirror().addBox(-0.15F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, 2.2731F, -4.021F, 2.8708F, -0.628F, 0.1617F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 86).mirror().addBox(-0.3F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.9314F, -3.9452F, 2.1118F, -0.4634F, 0.111F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.4F, -1.475F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3345F, 1.7665F, -3.4166F, -1.2173F, -0.3412F, -0.0172F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-0.8745F, 0.468F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, -0.8112F, -0.6658F, -0.0606F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 77).mirror().addBox(-0.7689F, -0.1263F, -0.998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, -0.8836F, -0.5478F, 0.0659F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.7689F, -0.7324F, -0.7788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, -0.0982F, -0.5478F, 0.0659F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.6414F, -1.1238F, -0.9713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, -0.5631F, -0.0589F, -0.5561F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.6414F, -1.1996F, -0.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(29, 76).mirror().addBox(-0.6414F, -1.1996F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 0.6761F, -0.0589F, -0.5561F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.0672F, -1.1707F, -1.019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 1.0419F, 0.4007F, -0.8445F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.3316F, -1.2644F, -0.5959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 1.0006F, 0.1687F, -0.6822F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.6615F, -1.0792F, -0.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 0.2091F, -0.2036F, -0.6547F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.7903F, -0.869F, -0.3203F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 0.426F, -0.4183F, 0.18F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-0.7311F, -0.4997F, -0.0563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 0.8271F, -0.4888F, 0.2256F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-0.7104F, -1.1407F, 0.512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.321F, 1.1635F, -2.0725F, -0.2456F, 0.0574F, 0.2633F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-0.4533F, -0.7916F, 0.2812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.321F, 1.1635F, -2.0725F, 0.1937F, -0.1825F, 0.2167F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(-0.1F, -0.1122F, -0.824F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0346F, 0.163F, -0.7196F, 0.6054F, -0.1877F, 0.1434F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.1F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.2094F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(99, 66).mirror().addBox(-0.1F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.2094F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-0.1F, 0.2775F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7243F, 0.0F, 0.2094F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.1F, 0.3397F, 0.1286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, 0.0F, 0.2094F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.1F, 0.5689F, -0.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8116F, 0.0F, 0.2094F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.7142F, -0.6871F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(73, 80).mirror().addBox(-0.5642F, -0.6871F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.3593F, 1.3297F, -1.8468F, 1.985F, -0.4966F, -0.0692F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(-0.8127F, -0.9319F, -0.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.696F, 1.1635F, -1.9725F, 2.3426F, -0.5782F, 0.0184F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-0.5334F, -0.5642F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3593F, 1.3297F, -1.8468F, 1.7189F, -0.2946F, -0.0071F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.5F, -0.5713F, -0.4829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.271F, 1.1792F, -1.5977F, 0.9017F, -0.1377F, -0.0097F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-0.5F, -0.4389F, -0.5405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.271F, 1.1792F, -1.5977F, 1.2507F, -0.1377F, -0.0097F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.4834F, -0.5411F, -0.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3593F, 1.3297F, -1.8468F, 2.1291F, -0.2946F, -0.0071F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-0.5142F, -0.7492F, -0.836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3593F, 1.3297F, -1.8468F, 1.4713F, -0.3994F, -0.0391F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(100, 92).mirror().addBox(-0.8526F, -0.2748F, 0.5413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(100, 89).mirror().addBox(-0.8526F, -0.2748F, -0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.4F, 0.0F, -0.0701F, -0.3016F, 0.0969F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3085F, -0.167F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-1.6846F, -0.0659F, -3.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(5, 80).mirror().addBox(-1.6846F, -0.0659F, -3.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0343F, -1.158F, -0.0348F, -0.8115F, -0.001F));

		PartDefinition cube_r204 = lowerjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-0.8452F, -0.2061F, -3.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0343F, -1.158F, 0.0175F, -0.5061F, 0.0F));

		PartDefinition cube_r205 = lowerjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-0.1F, 0.0593F, -1.9047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0343F, -1.158F, -0.0262F, -0.0524F, 0.0F));

		PartDefinition cube_r206 = lowerjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-0.5F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(71, 12).addBox(2.7F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.6F, 0.5F, -0.175F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r207 = lowerjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-0.1F, -0.15F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0343F, -1.158F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r208 = lowerjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 98).addBox(2.7F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6F, 0.3236F, -0.9301F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r209 = lowerjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.5F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 12).addBox(2.7F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6F, 0.5F, -0.175F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r210 = lowerjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(87, 65).addBox(2.7F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.6F, 0.5F, -0.175F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r211 = lowerjaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-0.8452F, -0.0941F, -2.3287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0343F, -1.158F, -0.0349F, -0.5061F, 0.0F));

		PartDefinition cube_r212 = lowerjaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(98, 15).addBox(-0.1548F, -0.0941F, -2.3287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -0.0343F, -1.158F, -0.0349F, 0.5061F, 0.0F));

		PartDefinition cube_r213 = lowerjaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(10, 80).addBox(0.6846F, -0.0659F, -3.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(5, 80).addBox(0.6846F, -0.0659F, -3.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.0F, -0.0343F, -1.158F, -0.0348F, 0.8115F, 0.001F));

		PartDefinition cube_r214 = lowerjaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(78, 80).addBox(-0.1548F, -0.2061F, -3.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.0F, -0.0343F, -1.158F, 0.0175F, 0.5061F, 0.0F));

		PartDefinition cube_r215 = lowerjaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(65, 82).addBox(-2.0F, -0.6F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.467F, -4.4243F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r216 = lowerjaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.4936F, 0.873F, -2.7836F, -0.2705F, -0.5061F, 0.0F));

		PartDefinition cube_r217 = lowerjaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(99, 51).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.4936F, 0.873F, -2.7836F, -0.2705F, 0.5061F, 0.0F));

		PartDefinition cube_r218 = lowerjaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 25).addBox(-0.9F, 0.0593F, -1.9047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -0.0343F, -1.158F, -0.0262F, 0.0524F, 0.0F));

		PartDefinition cube_r219 = lowerjaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(71, 21).addBox(-0.9F, -0.15F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(2.0F, -0.0343F, -1.158F, 0.0F, 0.0524F, 0.0F));

		PartDefinition tail = Proganochelys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 68).addBox(-0.5F, -0.8F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(14, 65).addBox(0.0F, -1.3F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -2.9206F, 8.6031F, -0.1623F, 0.1623F, -0.0645F));

		PartDefinition cube_r220 = tail.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(91, 86).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.5801F, 1.9496F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r221 = tail.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(60, 91).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.5801F, 1.9496F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r222 = tail.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(90, 77).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.5801F, 1.9496F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r223 = tail.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 83).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.5801F, 1.9496F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r224 = tail.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(89, 71).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 89).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.7051F, 0.5496F, -0.4081F, -0.0319F, -0.392F));

		PartDefinition cube_r225 = tail.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(89, 68).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.7051F, 0.5496F, -0.1899F, -0.0319F, -0.392F));

		PartDefinition cube_r226 = tail.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(89, 62).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.7051F, 0.5496F, -0.3239F, -0.0916F, -0.9908F));

		PartDefinition cube_r227 = tail.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.7051F, 0.5496F, -0.1058F, -0.0916F, -0.9908F));

		PartDefinition cube_r228 = tail.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(32, 9).mirror().addBox(-1.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 1.55F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r229 = tail.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(90, 77).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 30).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.5801F, 1.9496F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r230 = tail.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(90, 83).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(90, 89).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.5801F, 1.9496F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r231 = tail.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(60, 91).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.5801F, 1.9496F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r232 = tail.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 86).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.5801F, 1.9496F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition cube_r233 = tail.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 59).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.7051F, 0.5496F, -0.1058F, 0.0916F, 0.9908F));

		PartDefinition cube_r234 = tail.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(89, 62).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.7051F, 0.5496F, -0.3239F, 0.0916F, 0.9908F));

		PartDefinition cube_r235 = tail.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(65, 89).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(89, 71).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.7051F, 0.5496F, -0.4081F, 0.0319F, 0.392F));

		PartDefinition cube_r236 = tail.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(89, 68).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 89).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.358F, -1.7051F, 0.5496F, -0.1899F, 0.0319F, 0.392F));

		PartDefinition cube_r237 = tail.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(32, 9).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 1.55F, 0.0F, 0.0F, 0.3142F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(51, 15).addBox(-0.5F, -0.7125F, -0.119F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(101, 30).addBox(0.0F, -1.0125F, -0.119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 101).addBox(0.0F, -1.0125F, 1.881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.065F, 2.0122F, -0.0822F, 0.3045F, -0.0247F));

		PartDefinition cube_r238 = tail2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2402F, 3.5124F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r239 = tail2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(93, 0).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2402F, 3.5124F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r240 = tail2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(90, 92).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2402F, 3.5124F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r241 = tail2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(85, 92).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2402F, 3.5124F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r242 = tail2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.3402F, 1.5124F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r243 = tail2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.3402F, 1.5124F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r244 = tail2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(92, 39).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.3402F, 1.5124F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r245 = tail2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 92).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.3402F, 1.5124F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r246 = tail2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.7F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 101).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2125F, 2.381F, 0.0F, 0.0F, -0.384F));

		PartDefinition cube_r247 = tail2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(20, 101).addBox(-0.3F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 101).addBox(0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2125F, 2.381F, 0.0F, 0.0F, 0.384F));

		PartDefinition cube_r248 = tail2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(47, 101).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4875F, 2.381F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r249 = tail2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(85, 92).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.2402F, 3.5124F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition cube_r250 = tail2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(90, 92).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.2402F, 3.5124F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r251 = tail2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 93).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(93, 6).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.2402F, 3.5124F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r252 = tail2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(93, 0).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 3).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.358F, -1.2402F, 3.5124F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r253 = tail2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(92, 39).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 92).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.3402F, 1.5124F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r254 = tail2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(40, 92).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(92, 42).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.3402F, 1.5124F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r255 = tail2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 45).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.3402F, 1.5124F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r256 = tail2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 92).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.3402F, 1.5124F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0317F, 3.8526F, -0.0198F, 0.2181F, -0.0043F));

		PartDefinition cube_r257 = tail3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(93, 24).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2835F, 1.4848F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r258 = tail3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2835F, 1.4848F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r259 = tail3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(93, 18).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(93, 9).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2835F, 1.4848F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r260 = tail3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 12).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -1.2835F, 1.4848F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r261 = tail3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(-0.6F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, 1.4901F, 0.0984F, 0.0358F, -0.3473F));

		PartDefinition cube_r262 = tail3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(25, 101).addBox(-0.4F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, 1.4901F, 0.0984F, -0.0358F, 0.3473F));

		PartDefinition cube_r263 = tail3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(41, 101).addBox(0.0F, -1.3F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(38, 101).addBox(0.0F, -1.3F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 39).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.15F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r264 = tail3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(93, 9).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 18).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.2835F, 1.4848F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r265 = tail3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(93, 12).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(93, 15).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.2835F, 1.4848F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r266 = tail3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(93, 21).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -1.2835F, 1.4848F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r267 = tail3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(93, 24).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -1.2835F, 1.4848F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition cube_r268 = tail3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 101).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0418F, 2.2555F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r269 = tail3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(50, 101).addBox(0.0F, 0.6F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5192F, -1.4717F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(42, 68).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 101).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6799F, 2.8384F, 0.2916F, 0.1673F, 0.05F));

		PartDefinition cube_r270 = tail4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(95, 83).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 3.7463F, -0.3035F, -0.3728F, -0.9447F));

		PartDefinition cube_r271 = tail4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 95).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 3.7463F, -0.5217F, -0.3728F, -0.9447F));

		PartDefinition cube_r272 = tail4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(95, 77).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(65, 95).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 3.7463F, -0.7258F, -0.1582F, -0.3616F));

		PartDefinition cube_r273 = tail4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 95).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 3.7463F, -0.5076F, -0.1582F, -0.3616F));

		PartDefinition cube_r274 = tail4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 95).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 2.7463F, -0.7258F, -0.1582F, -0.3616F));

		PartDefinition cube_r275 = tail4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(45, 95).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 2.7463F, -0.5076F, -0.1582F, -0.3616F));

		PartDefinition cube_r276 = tail4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 2.7463F, -0.5217F, -0.3728F, -0.9447F));

		PartDefinition cube_r277 = tail4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.5036F, 2.7463F, -0.3035F, -0.3728F, -0.9447F));

		PartDefinition cube_r278 = tail4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(94, 68).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6036F, 0.7463F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r279 = tail4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6036F, 0.7463F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r280 = tail4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(60, 94).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(94, 51).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6036F, 0.7463F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r281 = tail4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 57).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 54).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6036F, 0.7463F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r282 = tail4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(65, 95).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 77).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 3.7463F, -0.7258F, 0.1582F, 0.3616F));

		PartDefinition cube_r283 = tail4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(70, 95).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(75, 95).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 3.7463F, -0.5076F, 0.1582F, 0.3616F));

		PartDefinition cube_r284 = tail4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(80, 95).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 3.7463F, -0.5217F, 0.3728F, 0.9447F));

		PartDefinition cube_r285 = tail4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(95, 83).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 3.7463F, -0.3035F, 0.3728F, 0.9447F));

		PartDefinition cube_r286 = tail4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(25, 95).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 2.7463F, -0.3035F, 0.3728F, 0.9447F));

		PartDefinition cube_r287 = tail4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(35, 95).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 2.7463F, -0.5217F, 0.3728F, 0.9447F));

		PartDefinition cube_r288 = tail4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(40, 95).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(55, 95).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 2.7463F, -0.7258F, 0.1582F, 0.3616F));

		PartDefinition cube_r289 = tail4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(45, 95).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 95).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.358F, -0.5036F, 2.7463F, -0.5076F, 0.1582F, 0.3616F));

		PartDefinition cube_r290 = tail4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(94, 51).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 94).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.6036F, 0.7463F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r291 = tail4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(94, 54).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(94, 57).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.6036F, 0.7463F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r292 = tail4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(94, 60).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.6036F, 0.7463F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r293 = tail4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(94, 68).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.6036F, 0.7463F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition cube_r294 = tail4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(56, 101).addBox(0.0F, 0.7F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7217F, -0.5829F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(42, 72).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(53, 101).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0313F, 1.8341F, 0.0606F, 0.0F, 0.0F));

		PartDefinition cube_r295 = tail5.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 101).addBox(0.0F, 1.4F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6905F, -2.417F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(49, 72).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0197F, 1.9602F, 0.0627F, 0.2613F, 0.0162F));

		PartDefinition cube_r296 = tail6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(97, 63).mirror().addBox(-0.7774F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4738F, 0.0676F, 2.3279F, -1.2972F, -0.6722F, -0.3854F));

		PartDefinition cube_r297 = tail6.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-0.7774F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.4738F, 0.0676F, 2.3279F, -1.5153F, -0.6722F, -0.3854F));

		PartDefinition cube_r298 = tail6.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.3978F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.4738F, -0.1323F, 2.4279F, -1.6275F, -0.0919F, -0.2159F));

		PartDefinition cube_r299 = tail6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.3978F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4738F, -0.1323F, 2.4279F, -1.4093F, -0.0919F, -0.2159F));

		PartDefinition cube_r300 = tail6.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(97, 45).mirror().addBox(-0.7774F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6737F, -0.2824F, 2.1279F, -0.6949F, -0.748F, -0.731F));

		PartDefinition cube_r301 = tail6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-0.7774F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.6737F, -0.2824F, 2.1279F, -0.913F, -0.748F, -0.731F));

		PartDefinition cube_r302 = tail6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-0.3978F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.6737F, -0.4824F, 2.2279F, -1.2135F, -0.3101F, -0.2459F));

		PartDefinition cube_r303 = tail6.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-0.3978F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6737F, -0.4824F, 2.2279F, -0.9954F, -0.3101F, -0.2459F));

		PartDefinition cube_r304 = tail6.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(-0.7774F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.4824F, 1.5279F, -0.4656F, -0.559F, -0.8714F));

		PartDefinition cube_r305 = tail6.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-0.7774F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.4824F, 1.5279F, -0.6837F, -0.559F, -0.8714F));

		PartDefinition cube_r306 = tail6.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-0.3978F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.6824F, 1.6279F, -0.9523F, -0.2369F, -0.3169F));

		PartDefinition cube_r307 = tail6.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.3978F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.6824F, 1.6279F, -0.7342F, -0.2369F, -0.3169F));

		PartDefinition cube_r308 = tail6.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-0.3978F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.7573F, 1.1279F, -0.4008F, -0.1172F, -0.3763F));

		PartDefinition cube_r309 = tail6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.3978F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.7573F, 1.1279F, -0.619F, -0.1172F, -0.3763F));

		PartDefinition cube_r310 = tail6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-0.7774F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.5574F, 1.0279F, -0.4526F, -0.2801F, -0.9668F));

		PartDefinition cube_r311 = tail6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.7774F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5737F, -0.5574F, 1.0279F, -0.2344F, -0.2801F, -0.9668F));

		PartDefinition cube_r312 = tail6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.9469F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6151F, 0.552F, -0.1739F, -0.1935F, -0.9811F));

		PartDefinition cube_r313 = tail6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.9469F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6151F, 0.552F, -0.392F, -0.1935F, -0.9811F));

		PartDefinition cube_r314 = tail6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(95, 92).mirror().addBox(-0.6206F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(85, 95).mirror().addBox(-0.6206F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6151F, 0.552F, -0.5213F, -0.0782F, -0.3858F));

		PartDefinition cube_r315 = tail6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-0.6206F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(-0.6206F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.358F, -0.6151F, 0.552F, -0.3031F, -0.0782F, -0.3858F));

		PartDefinition cube_r316 = tail6.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(78, 0).addBox(-0.6022F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4738F, -0.1323F, 2.4279F, -1.4093F, 0.0919F, 0.2159F));

		PartDefinition cube_r317 = tail6.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 4).addBox(-0.6022F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.4738F, -0.1323F, 2.4279F, -1.6275F, 0.0919F, 0.2159F));

		PartDefinition cube_r318 = tail6.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(60, 97).addBox(-0.2226F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.4738F, 0.0676F, 2.3279F, -1.5153F, 0.6722F, 0.3854F));

		PartDefinition cube_r319 = tail6.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(97, 63).addBox(-0.2226F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4738F, 0.0676F, 2.3279F, -1.2972F, 0.6722F, 0.3854F));

		PartDefinition cube_r320 = tail6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(26, 79).addBox(-0.6022F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6737F, -0.4824F, 2.2279F, -0.9954F, 0.3101F, 0.2459F));

		PartDefinition cube_r321 = tail6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(79, 37).addBox(-0.6022F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.6737F, -0.4824F, 2.2279F, -1.2135F, 0.3101F, 0.2459F));

		PartDefinition cube_r322 = tail6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(97, 42).addBox(-0.2226F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.6737F, -0.2824F, 2.1279F, -0.913F, 0.748F, 0.731F));

		PartDefinition cube_r323 = tail6.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(97, 45).addBox(-0.2226F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6737F, -0.2824F, 2.1279F, -0.6949F, 0.748F, 0.731F));

		PartDefinition cube_r324 = tail6.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(78, 51).addBox(-0.6022F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5737F, -0.6824F, 1.6279F, -0.7342F, 0.2369F, 0.3169F));

		PartDefinition cube_r325 = tail6.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(21, 79).addBox(-0.6022F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5737F, -0.6824F, 1.6279F, -0.9523F, 0.2369F, 0.3169F));

		PartDefinition cube_r326 = tail6.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(96, 86).addBox(-0.2226F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5737F, -0.4824F, 1.5279F, -0.6837F, 0.559F, 0.8714F));

		PartDefinition cube_r327 = tail6.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(97, 39).addBox(-0.2226F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5737F, -0.4824F, 1.5279F, -0.4656F, 0.559F, 0.8714F));

		PartDefinition cube_r328 = tail6.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(30, 96).addBox(-0.2226F, -0.5041F, -0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5737F, -0.5574F, 1.0279F, -0.2344F, 0.2801F, 0.9668F));

		PartDefinition cube_r329 = tail6.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(96, 30).addBox(-0.2226F, -0.468F, -0.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5737F, -0.5574F, 1.0279F, -0.4526F, 0.2801F, 0.9668F));

		PartDefinition cube_r330 = tail6.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(78, 20).addBox(-0.6022F, -0.7052F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5737F, -0.7573F, 1.1279F, -0.619F, 0.1172F, 0.3763F));

		PartDefinition cube_r331 = tail6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(78, 24).addBox(-0.6022F, -0.7492F, -0.4679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5737F, -0.7573F, 1.1279F, -0.4008F, 0.1172F, 0.3763F));

		PartDefinition cube_r332 = tail6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(85, 95).addBox(-0.3794F, -0.3509F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 92).addBox(-0.3794F, -0.7259F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.6151F, 0.552F, -0.5213F, 0.0782F, 0.3858F));

		PartDefinition cube_r333 = tail6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(95, 89).addBox(-0.3794F, -0.3736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(90, 95).addBox(-0.3794F, -0.7736F, -0.4825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.6151F, 0.552F, -0.3031F, 0.0782F, 0.3858F));

		PartDefinition cube_r334 = tail6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(95, 95).addBox(-0.0531F, -0.6073F, -0.5414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.358F, -0.6151F, 0.552F, -0.392F, 0.1935F, 0.9811F));

		PartDefinition cube_r335 = tail6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 96).addBox(-0.0531F, -0.6506F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.358F, -0.6151F, 0.552F, -0.1739F, 0.1935F, 0.9811F));

		PartDefinition leftCarapace = Proganochelys.addOrReplaceChild("leftCarapace", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5F, 0.25F));

		PartDefinition cube_r336 = leftCarapace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(17, 33).addBox(0.0F, 0.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.7772F, 2.9816F, -0.0712F, 0.0332F, 0.4352F));

		PartDefinition cube_r337 = leftCarapace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(40, 9).addBox(0.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.1252F, -5.0919F, 2.849F, -0.0644F, 0.045F, 0.6094F));

		PartDefinition cube_r338 = leftCarapace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(75, 65).addBox(-0.903F, -0.7395F, -1.8627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2331F, -5.0288F, 4.8355F, 0.0386F, 0.0793F, 0.2718F));

		PartDefinition cube_r339 = leftCarapace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(14, 76).addBox(-0.2692F, -0.1491F, -1.8627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2331F, -5.0288F, 4.8355F, -0.0626F, 0.0622F, -0.9709F));

		PartDefinition cube_r340 = leftCarapace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(69, 31).addBox(-0.2741F, -0.1474F, -0.1625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2331F, -5.0288F, 4.8355F, -0.2012F, -0.3138F, -0.9209F));

		PartDefinition cube_r341 = leftCarapace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 68).addBox(-0.903F, -0.7343F, -0.1625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2331F, -5.0288F, 4.8355F, -0.3628F, 0.0793F, 0.2718F));

		PartDefinition cube_r342 = leftCarapace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(49, 33).addBox(0.0F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.9439F, -3.7763F, -0.1758F, 0.2105F, -0.2143F));

		PartDefinition cube_r343 = leftCarapace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(51, 21).addBox(0.4307F, -1.0F, 0.5955F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.75F, 0.0758F, -0.261F, -0.4661F));

		PartDefinition cube_r344 = leftCarapace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(60, 32).addBox(0.1493F, -1.0F, -0.9091F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.75F, 0.0977F, -0.7218F, -0.5111F));

		PartDefinition cube_r345 = leftCarapace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 38).addBox(-2.8448F, -1.0F, -1.9624F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.35F, 0.0F, -1.5708F, -0.4363F));

		PartDefinition cube_r346 = leftCarapace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 42).addBox(-2.5448F, -1.0357F, -1.993F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-2.7448F, -1.0357F, -4.993F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 0.2F, -0.95F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition cube_r347 = leftCarapace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(7, 77).addBox(-1.8F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5982F, -3.3558F, -5.5948F, -1.8939F, -1.2018F, 1.1301F));

		PartDefinition cube_r348 = leftCarapace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(32, 40).addBox(-1.7F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.8911F, -2.6487F, -3.0948F, 0.0F, -0.9163F, -0.7854F));

		PartDefinition cube_r349 = leftCarapace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(63, 69).addBox(0.0F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7295F, -3.487F, 1.8372F, 3.1416F, -0.6545F, 2.3562F));

		PartDefinition cube_r350 = leftCarapace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(14, 68).addBox(-0.4F, -0.5F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7295F, -3.487F, 1.8372F, 3.1416F, 0.0873F, 2.3562F));

		PartDefinition cube_r351 = leftCarapace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(63, 73).addBox(1.8552F, -1.0357F, -1.993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, 0.2F, -0.55F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition cube_r352 = leftCarapace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(56, 69).addBox(-0.375F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7698F, -0.5274F, -3.6948F, 3.1416F, -1.309F, 2.3562F));

		PartDefinition cube_r353 = leftCarapace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(69, 35).addBox(2.2354F, -0.8579F, -1.1261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.2F, -0.55F, 0.3045F, -1.3241F, -1.0913F));

		PartDefinition cube_r354 = leftCarapace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(25, 98).addBox(-1.5694F, -1.0F, -1.1276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.85F, -3.1416F, -0.8378F, 2.7053F));

		PartDefinition cube_r355 = leftCarapace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(83, 27).addBox(-0.6F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2537F, 0.33F, -4.8269F, -2.8798F, -0.576F, 2.7053F));

		PartDefinition cube_r356 = leftCarapace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(28, 72).addBox(-0.4999F, -0.804F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, 0.139F, 0.0368F, 0.4349F));

		PartDefinition cube_r357 = leftCarapace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(35, 72).addBox(-0.0769F, 0.2111F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, 0.0104F, 0.1434F, -0.8061F));

		PartDefinition cube_r358 = leftCarapace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(32, 64).addBox(-0.0745F, 0.2102F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, -0.1229F, -0.2353F, -0.7849F));

		PartDefinition cube_r359 = leftCarapace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(72, 39).addBox(-0.923F, 0.2109F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, 0.0806F, -0.1192F, 1.6667F));

		PartDefinition cube_r360 = leftCarapace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(63, 61).addBox(-0.9254F, 0.2101F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, -0.0513F, 0.26F, 1.6722F));

		PartDefinition cube_r361 = leftCarapace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4999F, -0.8066F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5381F, -5.4371F, 0.8362F, -0.2624F, 0.0368F, 0.4349F));

		PartDefinition cube_r362 = leftCarapace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 64).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.3137F, -6.045F, -3.6402F, -0.0356F, -0.1481F, -0.8016F));

		PartDefinition cube_r363 = leftCarapace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(25, 64).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.4074F, -6.4673F, -3.655F, -0.0638F, 0.1384F, 1.6697F));

		PartDefinition cube_r364 = leftCarapace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.8605F, -6.2562F, -3.6476F, -0.1516F, -0.0147F, 0.4361F));

		PartDefinition cube_r365 = leftCarapace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(14, 72).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.3137F, -6.045F, -3.6402F, 0.0972F, 0.231F, -0.79F));

		PartDefinition cube_r366 = leftCarapace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(21, 72).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.4074F, -6.4673F, -3.655F, 0.0686F, -0.2408F, 1.6688F));

		PartDefinition cube_r367 = leftCarapace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.8605F, -6.2562F, -3.6476F, 0.2498F, -0.0147F, 0.4361F));

		PartDefinition cube_r368 = leftCarapace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(21, 11).addBox(0.0F, -0.05F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -7.0537F, -1.0173F, 0.0316F, -0.0147F, 0.4361F));

		PartDefinition cube_r369 = leftCarapace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(34, 33).addBox(0.0F, -0.05F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.1252F, -5.3642F, -0.9583F, 0.0286F, -0.02F, 0.6106F));

		PartDefinition cube_r370 = leftCarapace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(62, 28).addBox(0.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 52).addBox(0.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 25).addBox(0.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.9917F, -1.5266F, -0.0346F, -0.0043F, -0.1221F));

		PartDefinition cube_r371 = leftCarapace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(62, 8).addBox(0.0F, -0.9868F, -2.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 11).addBox(0.0F, -0.9868F, -0.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.569F, 3.9062F, -0.1571F, 0.0F, -0.1222F));

		PartDefinition cube_r372 = leftCarapace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(62, 14).addBox(0.0F, -1.379F, 1.6609F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.569F, 3.9062F, -0.3752F, 0.0F, -0.1222F));

		PartDefinition cube_r373 = leftCarapace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(76, 16).addBox(-0.8F, -0.5F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.7523F, -4.405F, -9.073F, 2.6173F, 1.1003F, 3.1146F));

		PartDefinition cube_r374 = leftCarapace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(53, 10).addBox(-0.3F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1112F, -5.2811F, -8.7415F, 0.5247F, 1.1007F, 0.9252F));

		PartDefinition cube_r375 = leftCarapace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(83, 6).addBox(2.3F, 0.025F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(83, 9).addBox(1.7F, 0.025F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -6.8792F, -6.0142F, 0.2904F, 0.6558F, 0.6291F));

		PartDefinition cube_r376 = leftCarapace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -0.05F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.8792F, -6.0142F, 0.2302F, -0.106F, 0.4241F));

		PartDefinition cube_r377 = leftCarapace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 59).addBox(-0.9F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.4819F, -4.6767F, -6.994F, 0.2354F, 0.2338F, 0.5044F));

		PartDefinition cube_r378 = leftCarapace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(68, 43).addBox(0.0F, 0.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.7784F, -5.0684F, -7.1306F, 0.2618F, 0.2037F, 0.6257F));

		PartDefinition cube_r379 = leftCarapace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(54, 64).addBox(-1.0F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(5.8136F, -4.1408F, -5.9069F, 0.265F, 0.2543F, 0.6397F));

		PartDefinition cube_r380 = leftCarapace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(10, 83).addBox(-0.875F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.2012F, -3.8869F, -8.0774F, 0.2563F, 0.0012F, 0.5719F));

		PartDefinition cube_r381 = leftCarapace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(51, 83).addBox(-0.825F, 0.0F, -1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.1114F, -4.0104F, -7.775F, 0.3015F, 0.5478F, 0.7321F));

		PartDefinition cube_r382 = leftCarapace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(65, 39).addBox(-0.9013F, -0.4692F, -0.7509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4439F, -4.4089F, 8.2662F, -0.2366F, -0.7722F, 0.6256F));

		PartDefinition cube_r383 = leftCarapace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(99, 69).addBox(-0.7185F, -0.4692F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(2.4439F, -4.4089F, 8.2662F, -0.3189F, 1.0057F, 0.1869F));

		PartDefinition cube_r384 = leftCarapace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(99, 60).addBox(-0.9013F, -0.4692F, -0.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.5439F, -3.7589F, 8.2662F, -0.1929F, -0.7964F, 0.7343F));

		PartDefinition cube_r385 = leftCarapace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(100, 83).addBox(-0.7185F, -0.4692F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(3.5439F, -3.7589F, 8.2662F, -0.2488F, 0.9952F, 0.3856F));

		PartDefinition cube_r386 = leftCarapace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(83, 15).addBox(-0.0639F, -0.4692F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.5439F, -3.7589F, 8.2662F, -0.1349F, -0.0807F, 0.6065F));

		PartDefinition cube_r387 = leftCarapace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(15, 83).addBox(-0.0265F, -0.5007F, -1.3507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.4832F, -3.0732F, 8.0348F, -0.1772F, 0.1188F, 0.5457F));

		PartDefinition cube_r388 = leftCarapace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(100, 75).addBox(-0.2652F, -0.5007F, -0.3032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(4.4832F, -3.0732F, 8.0348F, -0.4681F, 1.1725F, 0.1308F));

		PartDefinition cube_r389 = leftCarapace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(56, 73).addBox(-1.3991F, -0.5007F, -0.9439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.4832F, -3.0732F, 8.0348F, -0.2127F, -0.593F, 0.687F));

		PartDefinition cube_r390 = leftCarapace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(98, 24).addBox(0.5555F, -0.5007F, -1.098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(4.4832F, -2.9981F, 8.0348F, -0.3878F, 1.0165F, 0.1875F));

		PartDefinition cube_r391 = leftCarapace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(83, 12).addBox(-0.0515F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.3833F, -2.9732F, 6.1348F, -0.1772F, 0.1188F, 0.5107F));

		PartDefinition cube_r392 = leftCarapace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(99, 36).addBox(-0.3152F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(5.3833F, -2.9732F, 6.1348F, -0.4681F, 1.1725F, 0.0959F));

		PartDefinition cube_r393 = leftCarapace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(99, 57).addBox(-0.5491F, -0.5007F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.3833F, -2.9732F, 6.1348F, -0.1824F, 0.2648F, 0.4837F));

		PartDefinition cube_r394 = leftCarapace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(76, 29).addBox(-0.6695F, -0.5007F, -1.098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(5.3833F, -2.9231F, 6.1348F, -0.3878F, 1.0165F, 0.1875F));

		PartDefinition cube_r395 = leftCarapace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(41, 83).addBox(-0.0515F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -2.8982F, 4.5348F, -0.1334F, 0.5791F, 0.4563F));

		PartDefinition cube_r396 = leftCarapace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(90, 98).addBox(-0.3152F, -0.5007F, -0.3032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(6.0832F, -2.8982F, 4.5348F, -2.3144F, 1.419F, -1.7906F));

		PartDefinition cube_r397 = leftCarapace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(99, 54).addBox(-0.5491F, -0.5007F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.0832F, -2.8982F, 4.5348F, -0.1494F, 0.7259F, 0.43F));

		PartDefinition cube_r398 = leftCarapace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(42, 5).addBox(-0.6695F, -0.5007F, -2.098F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.0832F, -2.8482F, 4.5348F, -1.1888F, 1.4221F, -0.6535F));

		PartDefinition cube_r399 = leftCarapace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(83, 21).addBox(-0.0515F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -3.2232F, 2.0348F, -0.0876F, 0.5398F, 0.4811F));

		PartDefinition cube_r400 = leftCarapace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(85, 98).addBox(-0.3152F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(6.0832F, -3.2232F, 2.0348F, -2.2564F, 1.4737F, -1.7325F));

		PartDefinition cube_r401 = leftCarapace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(70, 83).addBox(-0.9991F, -0.5007F, -0.1939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.0832F, -3.2232F, 2.0348F, -0.2119F, 1.206F, 0.3279F));

		PartDefinition cube_r402 = leftCarapace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(47, 76).addBox(-0.6695F, -0.5007F, -0.698F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.0832F, -3.2232F, 2.0348F, -1.8048F, 1.4936F, -1.2793F));

		PartDefinition cube_r403 = leftCarapace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(20, 83).addBox(-0.0515F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -3.3982F, -0.3652F, -0.0518F, 0.5234F, 0.4992F));

		PartDefinition cube_r404 = leftCarapace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(40, 76).addBox(-1.0695F, -0.5007F, -0.698F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.0832F, -3.3982F, -0.3652F, -1.5794F, 1.5259F, -1.0543F));

		PartDefinition cube_r405 = leftCarapace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(65, 98).addBox(-0.3152F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(30, 99).addBox(-0.6151F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -3.3982F, -0.3652F, -2.3459F, 1.5079F, -1.8218F));

		PartDefinition cube_r406 = leftCarapace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(88, 15).addBox(-1.2991F, -0.5007F, -0.0939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.0832F, -3.3982F, -0.3652F, -0.1221F, 1.1934F, 0.4116F));

		PartDefinition cube_r407 = leftCarapace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(83, 18).addBox(-0.0493F, -0.4977F, -1.2761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -3.3767F, -3.0638F, 0.0345F, 0.48F, 0.5408F));

		PartDefinition cube_r408 = leftCarapace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(88, 12).addBox(-1.1925F, -0.4977F, -1.0874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.8405F, -2.9559F, -2.5643F, 0.0753F, 1.1512F, 0.5936F));

		PartDefinition cube_r409 = leftCarapace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(55, 98).addBox(-0.3137F, -0.4977F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(0, 99).addBox(-0.6137F, -0.4977F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.0832F, -3.3767F, -3.0638F, 1.5803F, 1.5402F, 2.1051F));

		PartDefinition cube_r410 = leftCarapace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(62, 22).addBox(-2.068F, -0.4977F, -0.6963F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.0832F, -3.3767F, -3.0638F, 0.6156F, 1.5177F, 1.1398F));

		PartDefinition cube_r411 = leftCarapace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(99, 33).addBox(-0.9279F, -0.5519F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.9271F, -3.3432F, -5.9906F, 0.0289F, 0.9307F, 0.563F));

		PartDefinition cube_r412 = leftCarapace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(77, 62).addBox(-1.9668F, -0.5519F, -0.1994F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.7028F, -3.4928F, -5.2374F, 0.0819F, 1.3578F, 0.6198F));

		PartDefinition cube_r413 = leftCarapace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(98, 21).addBox(-0.4509F, -0.5519F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(5.7028F, -3.4928F, -5.2374F, 3.1012F, 1.1283F, -2.6383F));

		PartDefinition cube_r414 = leftCarapace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(20, 98).addBox(-0.325F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.6912F, -3.4922F, -6.1698F, 0.7939F, 1.2074F, 1.3317F));

		PartDefinition cube_r415 = leftCarapace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(98, 18).addBox(-1.2F, 0.025F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.1114F, -4.0104F, -7.775F, 2.5426F, 1.1045F, -3.1176F));

		PartDefinition cube_r416 = leftCarapace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(98, 80).addBox(-0.7F, 0.025F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(5.1114F, -4.0104F, -7.775F, 0.6018F, 1.1066F, 1.1223F));

		PartDefinition cube_r417 = leftCarapace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(7, 65).addBox(-0.925F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.1114F, -4.0104F, -7.775F, 0.5562F, 1.07F, 1.0708F));

		PartDefinition cube_r418 = leftCarapace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(19, 26).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.2842F, 5.9232F, -0.1505F, 0.0698F, 0.4311F));

		PartDefinition cube_r419 = leftCarapace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(38, 18).addBox(-0.3F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.2189F, -4.7036F, 7.6865F, -0.1502F, 0.018F, 0.4389F));

		PartDefinition cube_r420 = leftCarapace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(88, 9).addBox(-0.3F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.7382F, -3.8963F, 6.8321F, -0.1768F, 0.3442F, 0.5549F));

		PartDefinition cube_r421 = leftCarapace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(88, 50).addBox(-0.3758F, -0.2556F, -1.3781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -1.083F, 0.0447F, 0.3463F));

		PartDefinition cube_r422 = leftCarapace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(56, 83).addBox(-0.3758F, -0.5084F, -2.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.8649F, 0.0447F, 0.3463F));

		PartDefinition cube_r423 = leftCarapace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(70, 73).addBox(-0.3758F, -0.5671F, -1.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6903F, 0.0447F, 0.3463F));

		PartDefinition cube_r424 = leftCarapace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(70, 69).addBox(-2.0768F, -0.4903F, 1.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.4033F, 0.5426F, -0.0863F));

		PartDefinition cube_r425 = leftCarapace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(31, 56).addBox(-1.3935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(9, 56).addBox(-0.9935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.3431F, 0.0419F, 0.1153F));

		PartDefinition cube_r426 = leftCarapace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(55, 0).addBox(-0.3758F, -0.4009F, -2.6241F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.2104F, 0.0447F, 0.3463F));

		PartDefinition cube_r427 = leftCarapace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(88, 27).addBox(-0.3758F, 2.6641F, -2.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.8823F, 0.0447F, 0.3463F));

		PartDefinition cube_r428 = leftCarapace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(45, 79).addBox(-0.3758F, 0.7948F, -0.8218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -1.5804F, 0.0447F, 0.3463F));

		PartDefinition cube_r429 = leftCarapace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(78, 12).addBox(-0.3758F, 0.6249F, -2.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6641F, 0.0447F, 0.3463F));

		PartDefinition cube_r430 = leftCarapace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(84, 35).addBox(-0.3758F, -0.1954F, -2.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.5594F, 0.0447F, 0.3463F));

		PartDefinition cube_r431 = leftCarapace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(88, 24).addBox(-0.3758F, -0.3655F, -2.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.734F, 0.0447F, 0.3463F));

		PartDefinition cube_r432 = leftCarapace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(88, 21).addBox(-0.3758F, -1.8409F, -2.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 8).addBox(-0.3758F, -1.8409F, -2.2879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.3413F, 0.0447F, 0.3463F));

		PartDefinition cube_r433 = leftCarapace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(21, 68).addBox(-0.331F, -2.2668F, -1.9199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(61, 65).addBox(-0.331F, -2.2988F, -3.1124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.43F, 0.0403F, 0.3116F));

		PartDefinition cube_r434 = leftCarapace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(30, 84).addBox(-0.331F, -1.9995F, -2.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6918F, 0.0403F, 0.3116F));

		PartDefinition cube_r435 = leftCarapace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(36, 26).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.7255F, -3.9739F, 2.6435F, -0.1677F, -0.1289F, 0.6369F));

		PartDefinition cube_r436 = leftCarapace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(7, 73).addBox(-1.0F, 0.031F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -6.7771F, 4.8154F, -0.0068F, -0.0253F, -1.3089F));

		PartDefinition cube_r437 = leftCarapace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(69, 17).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -6.7288F, 4.8367F, -0.0817F, -0.3398F, -1.3299F));

		PartDefinition cube_r438 = leftCarapace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(77, 75).addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.2283F, 7.1693F, -0.3545F, 0.1257F, 0.3265F));

		PartDefinition cube_r439 = leftCarapace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F))
				.texOffs(68, 65).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -7.4044F, -3.5839F, -0.0526F, -0.1938F, -1.3039F));

		PartDefinition cube_r440 = leftCarapace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(59, 44).addBox(-1.0F, 0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.016F))
				.texOffs(40, 59).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -7.4044F, -3.5839F, 0.0526F, 0.1938F, -1.3039F));

		PartDefinition cube_r441 = leftCarapace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(88, 6).addBox(-1.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(88, 3).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -7.2544F, 2.0161F, -0.0239F, -0.6474F, -1.3065F));

		PartDefinition cube_r442 = leftCarapace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(48, 46).addBox(-1.0F, 0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(37, 46).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -7.2544F, 2.0161F, 0.0113F, 0.0421F, -1.3088F));

		PartDefinition cube_r443 = leftCarapace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(51, 57).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -5.789F, 8.882F, -0.1565F, 0.2854F, 0.3972F));

		PartDefinition rightCarapace = Proganochelys.addOrReplaceChild("rightCarapace", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.5F, 0.25F));

		PartDefinition cube_r444 = rightCarapace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(17, 33).mirror().addBox(-4.0F, 0.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.7772F, 2.9816F, -0.0712F, -0.0332F, -0.4352F));

		PartDefinition cube_r445 = rightCarapace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(40, 9).mirror().addBox(-2.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.1252F, -5.0919F, 2.849F, -0.0644F, -0.045F, -0.6094F));

		PartDefinition cube_r446 = rightCarapace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-0.097F, -0.7395F, -1.8627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.2331F, -5.0288F, 4.8355F, 0.0386F, -0.0793F, -0.2718F));

		PartDefinition cube_r447 = rightCarapace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.7307F, -0.1491F, -1.8627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.2331F, -5.0288F, 4.8355F, -0.0626F, -0.0622F, 0.9709F));

		PartDefinition cube_r448 = rightCarapace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-0.7259F, -0.1474F, -0.1625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.2331F, -5.0288F, 4.8355F, -0.2012F, 0.3138F, 0.9209F));

		PartDefinition cube_r449 = rightCarapace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.097F, -0.7343F, -0.1625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.2331F, -5.0288F, 4.8355F, -0.3628F, -0.0793F, -0.2718F));

		PartDefinition cube_r450 = rightCarapace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-1.0F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9439F, -3.7763F, -0.1758F, -0.2105F, 0.2143F));

		PartDefinition cube_r451 = rightCarapace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-1.4307F, -1.0F, 0.5955F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 1.75F, 0.0758F, 0.261F, 0.4661F));

		PartDefinition cube_r452 = rightCarapace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-2.1492F, -1.0F, -0.9091F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 1.75F, 0.0977F, 0.7218F, 0.5111F));

		PartDefinition cube_r453 = rightCarapace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-3.1552F, -1.0F, -1.9624F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.35F, 0.0F, 1.5708F, 0.4363F));

		PartDefinition cube_r454 = rightCarapace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-2.4552F, -1.0357F, -1.993F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 27).mirror().addBox(-3.2552F, -1.0357F, -4.993F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.2F, -0.95F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition cube_r455 = rightCarapace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.2F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5982F, -3.3558F, -5.5948F, -1.8939F, 1.2018F, -1.1301F));

		PartDefinition cube_r456 = rightCarapace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(32, 40).mirror().addBox(-0.3F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.8911F, -2.6487F, -3.0948F, 0.0F, 0.9163F, 0.7854F));

		PartDefinition cube_r457 = rightCarapace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(63, 69).mirror().addBox(-1.0F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7295F, -3.487F, 1.8372F, 3.1416F, 0.6545F, -2.3562F));

		PartDefinition cube_r458 = rightCarapace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.6F, -0.5F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7295F, -3.487F, 1.8372F, 3.1416F, -0.0873F, -2.3562F));

		PartDefinition cube_r459 = rightCarapace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-2.8552F, -1.0357F, -1.993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.2F, -0.55F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition cube_r460 = rightCarapace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-0.625F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7698F, -0.5274F, -3.6948F, 3.1416F, 1.309F, -2.3562F));

		PartDefinition cube_r461 = rightCarapace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-3.2354F, -0.8579F, -1.1261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.2F, -0.55F, 0.3045F, 1.3241F, 1.0913F));

		PartDefinition cube_r462 = rightCarapace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(25, 98).mirror().addBox(0.5694F, -1.0F, -1.1276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -3.85F, -3.1416F, 0.8378F, -2.7053F));

		PartDefinition cube_r463 = rightCarapace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.4F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2537F, 0.33F, -4.8269F, -2.8798F, 0.576F, -2.7053F));

		PartDefinition cube_r464 = rightCarapace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-0.5001F, -0.804F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, 0.139F, -0.0368F, -0.4349F));

		PartDefinition cube_r465 = rightCarapace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.923F, 0.2111F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, 0.0104F, -0.1434F, 0.8061F));

		PartDefinition cube_r466 = rightCarapace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-0.9255F, 0.2102F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, -0.1229F, 0.2353F, 0.7849F));

		PartDefinition cube_r467 = rightCarapace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.077F, 0.2109F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, 0.0806F, 0.1192F, -1.6667F));

		PartDefinition cube_r468 = rightCarapace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-0.0746F, 0.2101F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, -0.0513F, -0.26F, -1.6722F));

		PartDefinition cube_r469 = rightCarapace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.5001F, -0.8066F, -0.1575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5381F, -5.4371F, 0.8362F, -0.2624F, -0.0368F, -0.4349F));

		PartDefinition cube_r470 = rightCarapace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.3137F, -6.045F, -3.6402F, -0.0356F, 0.1481F, 0.8016F));

		PartDefinition cube_r471 = rightCarapace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4074F, -6.4673F, -3.655F, -0.0638F, -0.1384F, -1.6697F));

		PartDefinition cube_r472 = rightCarapace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.8605F, -6.2562F, -3.6476F, -0.1516F, 0.0147F, -0.4361F));

		PartDefinition cube_r473 = rightCarapace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.3137F, -6.045F, -3.6402F, 0.0972F, -0.231F, 0.79F));

		PartDefinition cube_r474 = rightCarapace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4074F, -6.4673F, -3.655F, 0.0686F, 0.2408F, -1.6688F));

		PartDefinition cube_r475 = rightCarapace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.8605F, -6.2562F, -3.6476F, 0.2498F, 0.0147F, -0.4361F));

		PartDefinition cube_r476 = rightCarapace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(21, 11).mirror().addBox(-4.0F, -0.05F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -7.0537F, -1.0173F, 0.0316F, 0.0147F, -0.4361F));

		PartDefinition cube_r477 = rightCarapace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(34, 33).mirror().addBox(-2.0F, -0.05F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.1252F, -5.3642F, -0.9583F, 0.0286F, 0.02F, -0.6106F));

		PartDefinition cube_r478 = rightCarapace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-3.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 52).mirror().addBox(-3.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 25).mirror().addBox(-3.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.9917F, -1.5266F, -0.0346F, 0.0043F, 0.1221F));

		PartDefinition cube_r479 = rightCarapace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-3.0F, -0.9868F, -2.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 11).mirror().addBox(-3.0F, -0.9868F, -0.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.569F, 3.9062F, -0.1571F, 0.0F, 0.1222F));

		PartDefinition cube_r480 = rightCarapace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-3.0F, -1.379F, 1.6609F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.569F, 3.9062F, -0.3752F, 0.0F, 0.1222F));

		PartDefinition cube_r481 = rightCarapace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.2F, -0.5F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7523F, -4.405F, -9.073F, 2.6173F, -1.1003F, -3.1146F));

		PartDefinition cube_r482 = rightCarapace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(53, 10).mirror().addBox(-0.7F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1112F, -5.2811F, -8.7415F, 0.5247F, -1.1007F, -0.9252F));

		PartDefinition cube_r483 = rightCarapace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-3.3F, 0.025F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(83, 9).mirror().addBox(-2.7F, 0.025F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.8792F, -6.0142F, 0.2904F, -0.6558F, -0.6291F));

		PartDefinition cube_r484 = rightCarapace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-3.0F, -0.05F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.8792F, -6.0142F, 0.2302F, 0.106F, -0.4241F));

		PartDefinition cube_r485 = rightCarapace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.1F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.4819F, -4.6767F, -6.994F, 0.2354F, -0.2338F, -0.5044F));

		PartDefinition cube_r486 = rightCarapace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.7784F, -5.0684F, -7.1306F, 0.2618F, -0.2037F, -0.6257F));

		PartDefinition cube_r487 = rightCarapace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(54, 64).mirror().addBox(0.0F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-5.8136F, -4.1408F, -5.9069F, 0.265F, -0.2543F, -0.6397F));

		PartDefinition cube_r488 = rightCarapace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.125F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.2012F, -3.8869F, -8.0774F, 0.2563F, -0.0012F, -0.5719F));

		PartDefinition cube_r489 = rightCarapace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(51, 83).mirror().addBox(-0.175F, 0.0F, -1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1114F, -4.0104F, -7.775F, 0.3015F, -0.5478F, -0.7321F));

		PartDefinition cube_r490 = rightCarapace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.0987F, -0.4692F, -0.7509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4439F, -4.4089F, 8.2662F, -0.2366F, 0.7722F, -0.6256F));

		PartDefinition cube_r491 = rightCarapace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(99, 69).mirror().addBox(-0.2815F, -0.4692F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4439F, -4.4089F, 8.2662F, -0.3189F, -1.0057F, -0.1869F));

		PartDefinition cube_r492 = rightCarapace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(99, 60).mirror().addBox(-0.0987F, -0.4692F, -0.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.5439F, -3.7589F, 8.2662F, -0.1929F, 0.7964F, -0.7343F));

		PartDefinition cube_r493 = rightCarapace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(100, 83).mirror().addBox(-0.2815F, -0.4692F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.5439F, -3.7589F, 8.2662F, -0.2488F, -0.9952F, -0.3856F));

		PartDefinition cube_r494 = rightCarapace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.9361F, -0.4692F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.5439F, -3.7589F, 8.2662F, -0.1349F, 0.0807F, -0.6065F));

		PartDefinition cube_r495 = rightCarapace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.9735F, -0.5007F, -1.3507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.4832F, -3.0732F, 8.0348F, -0.1772F, -0.1188F, -0.5457F));

		PartDefinition cube_r496 = rightCarapace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(100, 75).mirror().addBox(-0.7348F, -0.5007F, -0.3032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-4.4832F, -3.0732F, 8.0348F, -0.4681F, -1.1725F, -0.1308F));

		PartDefinition cube_r497 = rightCarapace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(56, 73).mirror().addBox(0.3991F, -0.5007F, -0.9439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-4.4832F, -3.0732F, 8.0348F, -0.2127F, 0.593F, -0.687F));

		PartDefinition cube_r498 = rightCarapace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-1.5555F, -0.5007F, -1.098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-4.4832F, -2.9981F, 8.0348F, -0.3878F, -1.0165F, -0.1875F));

		PartDefinition cube_r499 = rightCarapace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.9485F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.3833F, -2.9732F, 6.1348F, -0.1772F, -0.1188F, -0.5107F));

		PartDefinition cube_r500 = rightCarapace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(99, 36).mirror().addBox(-0.6848F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-5.3833F, -2.9732F, 6.1348F, -0.4681F, -1.1725F, -0.0959F));

		PartDefinition cube_r501 = rightCarapace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(-0.4509F, -0.5007F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.3833F, -2.9732F, 6.1348F, -0.1824F, -0.2648F, -0.4837F));

		PartDefinition cube_r502 = rightCarapace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-1.3305F, -0.5007F, -1.098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-5.3833F, -2.9231F, 6.1348F, -0.3878F, -1.0165F, -0.1875F));

		PartDefinition cube_r503 = rightCarapace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-0.9485F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -2.8982F, 4.5348F, -0.1334F, -0.5791F, -0.4563F));

		PartDefinition cube_r504 = rightCarapace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(90, 98).mirror().addBox(-0.6849F, -0.5007F, -0.3032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -2.8982F, 4.5348F, -2.3144F, -1.419F, 1.7906F));

		PartDefinition cube_r505 = rightCarapace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(99, 54).mirror().addBox(-0.4509F, -0.5007F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -2.8982F, 4.5348F, -0.1494F, -0.7259F, -0.43F));

		PartDefinition cube_r506 = rightCarapace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(42, 5).mirror().addBox(-2.3305F, -0.5007F, -2.098F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -2.8482F, 4.5348F, -1.1888F, -1.4221F, 0.6535F));

		PartDefinition cube_r507 = rightCarapace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-0.9485F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.2232F, 2.0348F, -0.0876F, -0.5398F, -0.4811F));

		PartDefinition cube_r508 = rightCarapace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-0.6849F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.2232F, 2.0348F, -2.2564F, -1.4737F, 1.7325F));

		PartDefinition cube_r509 = rightCarapace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.0009F, -0.5007F, -0.1939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.2232F, 2.0348F, -0.2119F, -1.206F, -0.3279F));

		PartDefinition cube_r510 = rightCarapace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-1.3305F, -0.5007F, -0.698F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.2232F, 2.0348F, -1.8048F, -1.4936F, 1.2793F));

		PartDefinition cube_r511 = rightCarapace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.9485F, -0.5007F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3982F, -0.3652F, -0.0518F, -0.5234F, -0.4992F));

		PartDefinition cube_r512 = rightCarapace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.9305F, -0.5007F, -0.698F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3982F, -0.3652F, -1.5794F, -1.5259F, 1.0543F));

		PartDefinition cube_r513 = rightCarapace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(65, 98).mirror().addBox(-0.6849F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(30, 99).mirror().addBox(-0.3849F, -0.5007F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3982F, -0.3652F, -2.3459F, -1.5079F, 1.8218F));

		PartDefinition cube_r514 = rightCarapace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(88, 15).mirror().addBox(0.2991F, -0.5007F, -0.0939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3982F, -0.3652F, -0.1221F, -1.1934F, -0.4116F));

		PartDefinition cube_r515 = rightCarapace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.9507F, -0.4977F, -1.2761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3767F, -3.0638F, 0.0345F, -0.48F, -0.5408F));

		PartDefinition cube_r516 = rightCarapace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(0.1925F, -0.4977F, -1.0874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.8405F, -2.9559F, -2.5643F, 0.0753F, -1.1512F, -0.5936F));

		PartDefinition cube_r517 = rightCarapace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(55, 98).mirror().addBox(-0.6863F, -0.4977F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(0, 99).mirror().addBox(-0.3863F, -0.4977F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3767F, -3.0638F, 1.5803F, -1.5402F, -2.1051F));

		PartDefinition cube_r518 = rightCarapace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-0.932F, -0.4977F, -0.6963F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.0832F, -3.3767F, -3.0638F, 0.6156F, -1.5177F, -1.1398F));

		PartDefinition cube_r519 = rightCarapace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(99, 33).mirror().addBox(-0.0721F, -0.5519F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.9271F, -3.3432F, -5.9906F, 0.0289F, -0.9307F, -0.563F));

		PartDefinition cube_r520 = rightCarapace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-0.0332F, -0.5519F, -0.1994F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.7028F, -3.4928F, -5.2374F, 0.0819F, -1.3578F, -0.6198F));

		PartDefinition cube_r521 = rightCarapace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.5491F, -0.5519F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-5.7028F, -3.4928F, -5.2374F, 3.1012F, -1.1283F, 2.6383F));

		PartDefinition cube_r522 = rightCarapace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.675F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.6912F, -3.4922F, -6.1698F, 0.7939F, -1.2074F, -1.3317F));

		PartDefinition cube_r523 = rightCarapace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(0.2F, 0.025F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.1114F, -4.0104F, -7.775F, 2.5426F, -1.1045F, 3.1176F));

		PartDefinition cube_r524 = rightCarapace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(98, 80).mirror().addBox(-0.3F, 0.025F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-5.1114F, -4.0104F, -7.775F, 0.6018F, -1.1066F, -1.1223F));

		PartDefinition cube_r525 = rightCarapace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.075F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.1114F, -4.0104F, -7.775F, 0.5562F, -1.07F, -1.0708F));

		PartDefinition cube_r526 = rightCarapace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.2842F, 5.9232F, -0.1505F, -0.0698F, -0.4311F));

		PartDefinition cube_r527 = rightCarapace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-0.7F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.2189F, -4.7036F, 7.6865F, -0.1502F, -0.018F, -0.4389F));

		PartDefinition cube_r528 = rightCarapace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.7F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.7382F, -3.8963F, 6.8321F, -0.1768F, -0.3442F, -0.5549F));

		PartDefinition cube_r529 = rightCarapace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(-0.6242F, -0.2556F, -1.3781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -1.083F, -0.0447F, -0.3463F));

		PartDefinition cube_r530 = rightCarapace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(56, 83).mirror().addBox(-0.6242F, -0.5084F, -2.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.8649F, -0.0447F, -0.3463F));

		PartDefinition cube_r531 = rightCarapace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.6242F, -0.5671F, -1.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6903F, -0.0447F, -0.3463F));

		PartDefinition cube_r532 = rightCarapace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(1.0768F, -0.4903F, 1.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.4033F, -0.5426F, 0.0863F));

		PartDefinition cube_r533 = rightCarapace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(31, 56).mirror().addBox(0.3935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(9, 56).mirror().addBox(-0.0065F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.3431F, -0.0419F, -0.1153F));

		PartDefinition cube_r534 = rightCarapace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.6242F, -0.4009F, -2.6241F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.2104F, -0.0447F, -0.3463F));

		PartDefinition cube_r535 = rightCarapace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.6242F, 2.6641F, -2.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.8823F, -0.0447F, -0.3463F));

		PartDefinition cube_r536 = rightCarapace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-0.6242F, 0.7948F, -0.8218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -1.5804F, -0.0447F, -0.3463F));

		PartDefinition cube_r537 = rightCarapace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-0.6242F, 0.6249F, -2.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6641F, -0.0447F, -0.3463F));

		PartDefinition cube_r538 = rightCarapace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.6242F, -0.1954F, -2.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.5594F, -0.0447F, -0.3463F));

		PartDefinition cube_r539 = rightCarapace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-0.6242F, -0.3655F, -2.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.734F, -0.0447F, -0.3463F));

		PartDefinition cube_r540 = rightCarapace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-0.6242F, -1.8409F, -2.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 8).mirror().addBox(-0.6242F, -1.8409F, -2.2879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.3413F, -0.0447F, -0.3463F));

		PartDefinition cube_r541 = rightCarapace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.669F, -2.2668F, -1.9199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(61, 65).mirror().addBox(-0.669F, -2.2988F, -3.1124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.43F, -0.0403F, -0.3116F));

		PartDefinition cube_r542 = rightCarapace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.669F, -1.9995F, -2.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6918F, -0.0403F, -0.3116F));

		PartDefinition cube_r543 = rightCarapace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.7255F, -3.9739F, 2.6435F, -0.1677F, 0.1289F, -0.6369F));

		PartDefinition cube_r544 = rightCarapace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(0.0F, 0.031F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -6.7771F, 4.8154F, -0.0068F, 0.0253F, 1.3089F));

		PartDefinition cube_r545 = rightCarapace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -6.7288F, 4.8367F, -0.0817F, 0.3398F, 1.3299F));

		PartDefinition cube_r546 = rightCarapace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(77, 75).mirror().addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.2283F, 7.1693F, -0.3545F, -0.1257F, -0.3265F));

		PartDefinition cube_r547 = rightCarapace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(68, 65).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.4044F, -3.5839F, -0.0526F, 0.1938F, 1.3039F));

		PartDefinition cube_r548 = rightCarapace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(59, 44).mirror().addBox(0.0F, 0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(40, 59).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.4044F, -3.5839F, 0.0526F, -0.1938F, 1.3039F));

		PartDefinition cube_r549 = rightCarapace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(88, 3).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.2544F, 2.0161F, -0.0239F, 0.6474F, 1.3065F));

		PartDefinition cube_r550 = rightCarapace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(0.0F, 0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(37, 46).mirror().addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.2544F, 2.0161F, 0.0113F, -0.0421F, 1.3088F));

		PartDefinition cube_r551 = rightCarapace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.789F, 8.882F, -0.1565F, -0.2854F, -0.3972F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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